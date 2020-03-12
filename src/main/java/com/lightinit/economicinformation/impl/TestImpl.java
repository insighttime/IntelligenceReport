package com.lightinit.economicinformation.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.lightinit.economicinformation.entity.BasicDictionary;
import com.lightinit.economicinformation.entity.BasicDictionaryExample;
import com.lightinit.economicinformation.entity.SysUser;
import com.lightinit.economicinformation.mapper.mapper1.SysUserMapper;
import com.lightinit.economicinformation.mapper.mapper2.BasicDictionaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestImpl {
    @Autowired
    private SysUserMapper userMapper;
    @Autowired
    private BasicDictionaryMapper dictionaryMapper;
    public Object getUserList() {
        List<SysUser> list = userMapper.getUserList();
//        BasicDictionary basicDictionary = dictionaryMapper.selectByPrimaryKey((long) 10);
        return list;
    }

    public Object getDictionaryList() {
        BasicDictionary basicDictionary = dictionaryMapper.selectByPrimaryKey((long) 10);
        return basicDictionary;
    }
}
