package com.lightinit.economicinformation.mapper.mapper1;

import com.lightinit.economicinformation.entity.SysVerificationCode;
import com.lightinit.economicinformation.entity.SysVerificationCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysVerificationCodeMapper {
    long countByExample(SysVerificationCodeExample example);

    int deleteByExample(SysVerificationCodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysVerificationCode record);

    int insertSelective(SysVerificationCode record);

    List<SysVerificationCode> selectByExample(SysVerificationCodeExample example);

    SysVerificationCode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysVerificationCode record, @Param("example") SysVerificationCodeExample example);

    int updateByExample(@Param("record") SysVerificationCode record, @Param("example") SysVerificationCodeExample example);

    int updateByPrimaryKeySelective(SysVerificationCode record);

    int updateByPrimaryKey(SysVerificationCode record);
}