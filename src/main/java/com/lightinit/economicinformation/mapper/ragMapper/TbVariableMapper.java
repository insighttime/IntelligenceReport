package com.lightinit.economicinformation.mapper.ragMapper;

import com.lightinit.economicinformation.entity.TbVariable;
import com.lightinit.economicinformation.entity.TbVariableExample;
import java.util.List;

import com.lightinit.economicinformation.model.SearchVariableModel;
import com.lightinit.economicinformation.model.VariableListModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TbVariableMapper {
    long countByExample(TbVariableExample example);

    int deleteByExample(TbVariableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbVariable record);

    int insertSelective(TbVariable record);

    List<TbVariable> selectByExample(TbVariableExample example);

    TbVariable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbVariable record, @Param("example") TbVariableExample example);

    int updateByExample(@Param("record") TbVariable record, @Param("example") TbVariableExample example);

    int updateByPrimaryKeySelective(TbVariable record);

    int updateByPrimaryKey(TbVariable record);

    List<VariableListModel>  getVariable(SearchVariableModel variableModel);
}