package com.lightinit.economicinformation.mapper.ragMapper;

import com.lightinit.economicinformation.entity.TbFirstScreenVariable;
import com.lightinit.economicinformation.entity.TbFirstScreenVariableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbFirstScreenVariableMapper {
    long countByExample(TbFirstScreenVariableExample example);

    int deleteByExample(TbFirstScreenVariableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbFirstScreenVariable record);

    int insertSelective(TbFirstScreenVariable record);

    List<TbFirstScreenVariable> selectByExampleWithBLOBs(TbFirstScreenVariableExample example);

    List<TbFirstScreenVariable> selectByExample(TbFirstScreenVariableExample example);

    TbFirstScreenVariable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbFirstScreenVariable record, @Param("example") TbFirstScreenVariableExample example);

    int updateByExampleWithBLOBs(@Param("record") TbFirstScreenVariable record, @Param("example") TbFirstScreenVariableExample example);

    int updateByExample(@Param("record") TbFirstScreenVariable record, @Param("example") TbFirstScreenVariableExample example);

    int updateByPrimaryKeySelective(TbFirstScreenVariable record);

    int updateByPrimaryKeyWithBLOBs(TbFirstScreenVariable record);

    int updateByPrimaryKey(TbFirstScreenVariable record);

    List<TbFirstScreenVariable> selectById(@Param("idList") List<Integer> idList,@Param("databaseSuffix") String databaseSuffix);
}