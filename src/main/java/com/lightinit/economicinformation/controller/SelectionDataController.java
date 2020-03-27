package com.lightinit.economicinformation.controller;

import com.lightinit.economicinformation.impl.SelectionDataImpl;
import com.lightinit.economicinformation.model.SearchAttributeModel;
import com.lightinit.economicinformation.model.SearchDateModel;
import com.lightinit.economicinformation.model.SearchVariableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SelectionDataController {
    @Autowired
    private SelectionDataImpl selectionData;

    /**
     * 选择数据
     * @return
     */
    @GetMapping("/getDataBase")
    public Object getDataBase() {
        return selectionData.getDataBase();
    }

    /**
     * 根据数据库表后缀查询指标变量
     * @param variableModel
     * @return
     */
    @PostMapping("/getVariable")
    public Object getVariable(SearchVariableModel variableModel) {
        return selectionData.getVariable(variableModel);
    }
    /**
     * 根据数据库表后缀、指标变量ID查询属性
     * @param attributeModel
     * @return
     */
    @PostMapping("/getAttribute")
    public Object getAttribute(SearchAttributeModel attributeModel) {
        return selectionData.getAttribute(attributeModel);
    }

    /**
     *
     * @param dateModel
     * @return
     */
    @PostMapping("/getDate")
    public Object getDate(@RequestBody SearchDateModel dateModel) {
        return selectionData.getDate(dateModel);
    }


}
