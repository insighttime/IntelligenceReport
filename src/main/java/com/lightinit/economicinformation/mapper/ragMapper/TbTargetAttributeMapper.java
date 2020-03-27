package com.lightinit.economicinformation.mapper.ragMapper;

import com.lightinit.economicinformation.entity.TbTargetAttribute;
import com.lightinit.economicinformation.entity.TbTargetAttributeExample;
import com.lightinit.economicinformation.entity.TbTargetAttributeWithBLOBs;
import java.util.List;

import com.lightinit.economicinformation.model.AttributeListModel;
import com.lightinit.economicinformation.model.SearchAttributeModel;
import com.lightinit.economicinformation.model.SearchDateModel;
import org.apache.ibatis.annotations.Param;

public interface TbTargetAttributeMapper {
    long countByExample(TbTargetAttributeExample example);

    int deleteByExample(TbTargetAttributeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbTargetAttributeWithBLOBs record);

    int insertSelective(TbTargetAttributeWithBLOBs record);

    List<TbTargetAttributeWithBLOBs> selectByExampleWithBLOBs(TbTargetAttributeExample example);

    List<TbTargetAttribute> selectByExample(TbTargetAttributeExample example);

    TbTargetAttributeWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbTargetAttributeWithBLOBs record, @Param("example") TbTargetAttributeExample example);

    int updateByExampleWithBLOBs(@Param("record") TbTargetAttributeWithBLOBs record, @Param("example") TbTargetAttributeExample example);

    int updateByExample(@Param("record") TbTargetAttribute record, @Param("example") TbTargetAttributeExample example);

    int updateByPrimaryKeySelective(TbTargetAttributeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbTargetAttributeWithBLOBs record);

    int updateByPrimaryKey(TbTargetAttribute record);

    List<AttributeListModel> getAttribute(SearchAttributeModel attributeModel);

    List<TbTargetAttributeWithBLOBs> getDate(SearchDateModel dateModel);
}