package com.imooc.mall.Service;

import com.imooc.mall.model.pojo.User;

/**
 * 描述：   UserSerivce
 */
public interface UserSerivce {
    User getUser();

    void register(String userName, String password);
}
