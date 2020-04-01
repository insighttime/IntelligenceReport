package com.lightinit.economicinformation.mapper.ragMapper;

import com.lightinit.economicinformation.entity.TbOtherDatabaseInfo;
import com.lightinit.economicinformation.entity.TbOtherDatabaseInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TbOtherDatabaseInfoMapper {
    long countByExample(TbOtherDatabaseInfoExample example);

    int deleteByExample(TbOtherDatabaseInfoExample example);

    int insert(TbOtherDatabaseInfo record);

    int insertSelective(TbOtherDatabaseInfo record);

    List<TbOtherDatabaseInfo> selectByExample(TbOtherDatabaseInfoExample example);

    int updateByExampleSelective(@Param("record") TbOtherDatabaseInfo record, @Param("example") TbOtherDatabaseInfoExample example);

    int updateByExample(@Param("record") TbOtherDatabaseInfo record, @Param("example") TbOtherDatabaseInfoExample example);
}