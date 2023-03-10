package com.imooc.mall.Service;

import com.github.pagehelper.PageInfo;
import com.imooc.mall.model.request.CreateOrderReq;
import com.imooc.mall.model.vo.OrderVO;

/**
 * 描述：   订单Service
 */
public interface OrderService {

    String create(CreateOrderReq req);

    OrderVO detail(String orderNo);

    PageInfo listForCustmer(Integer pageNum, Integer pageSize);

    void cancel(String orderNo);

    String qrcode(String orderNo);

    PageInfo listForAdmin(Integer pageNum, Integer pageSize);

    void pay(String orderNo);

    void delivered(String orderNo);

    void finish(String orderNo);
}
