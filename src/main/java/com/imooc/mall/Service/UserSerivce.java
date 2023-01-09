package com.imooc.mall.Service;

import com.imooc.mall.exception.ImoocMallException;
import com.imooc.mall.model.pojo.User;

/**
 * 描述：   UserSerivce
 */
public interface UserSerivce {
    User getUser();

    void register(String userName, String password) throws ImoocMallException;

    User login(String userName, String password) throws ImoocMallException;
}
