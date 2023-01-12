package com.imooc.mall.Service;

import com.imooc.mall.model.request.CreateOrderReq;

/**
 * 描述：   订单Service
 */
public interface OrderService {

    String create(CreateOrderReq req);

}
