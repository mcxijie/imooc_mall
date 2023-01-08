package com.imooc.mall.Service.impl;


import com.imooc.mall.Service.UserSerivce;
import com.imooc.mall.model.dao.UserMapper;
import com.imooc.mall.model.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *描述：   UserSerivce实现类
 */
@Service
public class UserSerivceImpl implements UserSerivce {
    @Autowired
    UserMapper userMapper;


    @Override
    public User getUser() {
        return userMapper.selectByPrimaryKey(1);
    }
}
