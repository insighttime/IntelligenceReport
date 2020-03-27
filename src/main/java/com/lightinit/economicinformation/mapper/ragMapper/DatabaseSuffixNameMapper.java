package com.lightinit.economicinformation.mapper.ragMapper;

import com.lightinit.economicinformation.entity.DatabaseSuffixName;
import com.lightinit.economicinformation.entity.DatabaseSuffixNameExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DatabaseSuffixNameMapper {
    long countByExample(DatabaseSuffixNameExample example);

    int deleteByExample(DatabaseSuffixNameExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DatabaseSuffixName record);

    int insertSelective(DatabaseSuffixName record);

    List<DatabaseSuffixName> selectByExample(DatabaseSuffixNameExample example);

    DatabaseSuffixName selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DatabaseSuffixName record, @Param("example") DatabaseSuffixNameExample example);

    int updateByExample(@Param("record") DatabaseSuffixName record, @Param("example") DatabaseSuffixNameExample example);

    int updateByPrimaryKeySelective(DatabaseSuffixName record);

    int updateByPrimaryKey(DatabaseSuffixName record);
}