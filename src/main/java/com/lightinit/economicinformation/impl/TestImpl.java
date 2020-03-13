package com.lightinit.economicinformation.impl;

import com.lightinit.economicinformation.entity.SysUser;
import com.lightinit.economicinformation.mapper.mapper1.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestImpl {
    @Autowired
    private SysUserMapper userMapper;
    @Autowired
    public Object getUserList() {
        List<SysUser> list = userMapper.getUserList();
//        BasicDictionary basicDictionary = dictionaryMapper.selectByPrimaryKey((long) 10);
        return list;
    }

}
