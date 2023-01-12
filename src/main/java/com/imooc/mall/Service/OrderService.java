package com.imooc.mall.Service;

import com.imooc.mall.model.request.CreateOrderReq;
import com.imooc.mall.model.vo.OrderVO;

/**
 * 描述：   订单Service
 */
public interface OrderService {

    String create(CreateOrderReq req);

    OrderVO detail(String orderNo);
}
