package com.lightinit.economicinformation.impl;

import com.lightinit.economicinformation.dictionary.DicAttribute;
import com.lightinit.economicinformation.dictionary.DicFirstScreenVariable;
import com.lightinit.economicinformation.dictionary.DicVariable;
import com.lightinit.economicinformation.entity.*;
import com.lightinit.economicinformation.mapper.ragMapper.DatabaseSuffixNameMapper;
import com.lightinit.economicinformation.mapper.ragMapper.TbFirstScreenVariableMapper;
import com.lightinit.economicinformation.mapper.ragMapper.TbTargetAttributeMapper;
import com.lightinit.economicinformation.mapper.ragMapper.TbVariableMapper;
import com.lightinit.economicinformation.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SelectionDataImpl {
    @Autowired
    private DatabaseSuffixNameMapper databaseSuffixNameMapper;
    @Autowired
    private TbVariableMapper tbVariableMapper;
    @Autowired
    private TbTargetAttributeMapper tbTargetAttributeMapper;
    @Autowired
    private TbFirstScreenVariableMapper tbFirstScreenVariableMapper;

    public Object getDataBase() {
        DatabaseSuffixNameExample example = new DatabaseSuffixNameExample();
        List<DatabaseSuffixName> databaseSuffixNames = databaseSuffixNameMapper.selectByExample(example);
        return databaseSuffixNames;
    }

    public Object getVariable(SearchVariableModel variableModel) {
        //根据后缀查找表名
        if(variableModel.getDatabaseSuffix().equals(DicVariable.Travel)) {
            variableModel.setDatabaseSuffix(DicVariable.getInstance().getDicMap().get(variableModel.getDatabaseSuffix()));
        }else   if(variableModel.getDatabaseSuffix().equals(DicVariable.RAREEARTH)) {
            variableModel.setDatabaseSuffix(DicVariable.getInstance().getDicMap().get(variableModel.getDatabaseSuffix()));
        }
       List<VariableListModel> list = tbVariableMapper.getVariable(variableModel);
        return list;
    }

    public Object getAttribute(SearchAttributeModel attributeModel) {
        //根据后缀查找表名
        if(attributeModel.getDatabaseSuffix().equals(DicAttribute.Travel)) {
            attributeModel.setDatabaseSuffix(DicAttribute.getInstance().getDicMap().get(attributeModel.getDatabaseSuffix()));
        }else   if(attributeModel.getDatabaseSuffix().equals(DicAttribute.RAREEARTH)) {
            attributeModel.setDatabaseSuffix(DicAttribute.getInstance().getDicMap().get(attributeModel.getDatabaseSuffix()));
        }
        List<AttributeListModel> list = tbTargetAttributeMapper.getAttribute(attributeModel);
        return list;

    }

    public Object getDate(SearchDateModel dateModel) {
        //根据后缀查找表名
        String databaseSuffix  = dateModel.getDatabaseSuffix();
        if(dateModel.getDatabaseSuffix().equals(DicAttribute.Travel)) {
            dateModel.setDatabaseSuffix(DicAttribute.getInstance().getDicMap().get(dateModel.getDatabaseSuffix()));
        }else   if(dateModel.getDatabaseSuffix().equals(DicAttribute.RAREEARTH)) {
            dateModel.setDatabaseSuffix(DicAttribute.getInstance().getDicMap().get(dateModel.getDatabaseSuffix()));
        }
        List<TbTargetAttributeWithBLOBs> list = tbTargetAttributeMapper.getDate(dateModel);
        List<Integer> idList = new ArrayList<>();
        for(TbTargetAttributeWithBLOBs tbTargetAttribute : list) {
            if(tbTargetAttribute.getFilterCondition1Id().contains(",")) {
               int a = tbTargetAttribute.getFilterCondition1Id().length();
                String[] split = tbTargetAttribute.getFilterCondition1Id().substring(1,a-1).split(",");
                for(int i=0;i<split.length;i++) {
                    Integer ss = Integer.parseInt(split[i]);
                    idList.add(ss);
                }

            }else {
                Integer ss1 = Integer.valueOf(tbTargetAttribute.getFilterCondition1Id().substring(1,tbTargetAttribute.getFilterCondition1Id().length()-1));
                idList.add(ss1);
            }
        }

        if(databaseSuffix.equals(DicFirstScreenVariable.Travel)) {
            dateModel.setDatabaseSuffix(DicFirstScreenVariable.getInstance().getDicMap().get(databaseSuffix));
        }else   if(databaseSuffix.equals(DicFirstScreenVariable.RAREEARTH)) {
            dateModel.setDatabaseSuffix(DicFirstScreenVariable.getInstance().getDicMap().get(databaseSuffix));
        }
        List<TbFirstScreenVariable> TbFirstScreenVariables = tbFirstScreenVariableMapper.selectById(idList,dateModel.getDatabaseSuffix());
        String minDate ="";
        String maxDate ="";
        Date date = new Date();
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");

        for(TbFirstScreenVariable tbFirstScreenVariable:TbFirstScreenVariables) {
            if(tbFirstScreenVariable.getMaxOptionsValue().equals("今日")) {
                String format = sim.format(date);
                tbFirstScreenVariable.setMinOptionsValue(format);
            }
            if(tbFirstScreenVariable.getMinOptionsValue().equals("今日")) {
                String format = sim.format(date);
                tbFirstScreenVariable.setMaxOptionsValue(format);
            }
            //比较min
            if(StringUtils.isEmpty(minDate)) {
                minDate = tbFirstScreenVariable.getMinOptionsValue();
            }else {
                //返回正值是代表左侧日期大于参数日期，反之亦然，日期格式必须一致
                if(minDate.compareTo(tbFirstScreenVariable.getMinOptionsValue())>0) {
                    minDate = tbFirstScreenVariable.getMinOptionsValue();
                }

            }
            //比较max
            if(StringUtils.isEmpty(maxDate)) {
                maxDate = tbFirstScreenVariable.getMaxOptionsValue();
            }else {
                //返回正值是代表左侧日期大于参数日期，反之亦然，日期格式必须一致
                if(maxDate.compareTo(tbFirstScreenVariable.getMaxOptionsValue())<0) {
                    maxDate = tbFirstScreenVariable.getMaxOptionsValue();
                }
            }
        }
        TbFirstScreenVariable tbFirstScreenVariable = new TbFirstScreenVariable();
        tbFirstScreenVariable.setMinOptionsValue(minDate);
        tbFirstScreenVariable.setMaxOptionsValue(maxDate);
        return tbFirstScreenVariable;
    }
}
