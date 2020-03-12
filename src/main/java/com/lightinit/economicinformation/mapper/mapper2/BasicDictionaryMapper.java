package com.lightinit.economicinformation.mapper.mapper2;

import com.lightinit.economicinformation.entity.BasicDictionary;
import com.lightinit.economicinformation.entity.BasicDictionaryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BasicDictionaryMapper {
    long countByExample(BasicDictionaryExample example);

    int deleteByExample(BasicDictionaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BasicDictionary record);

    int insertSelective(BasicDictionary record);

    List<BasicDictionary> selectByExample(BasicDictionaryExample example);

    BasicDictionary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BasicDictionary record, @Param("example") BasicDictionaryExample example);

    int updateByExample(@Param("record") BasicDictionary record, @Param("example") BasicDictionaryExample example);

    int updateByPrimaryKeySelective(BasicDictionary record);

    int updateByPrimaryKey(BasicDictionary record);
}