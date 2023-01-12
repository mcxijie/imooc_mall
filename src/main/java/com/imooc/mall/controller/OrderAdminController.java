package com.imooc.mall.controller;

import com.github.pagehelper.PageInfo;
import com.imooc.mall.Service.OrderService;
import com.imooc.mall.common.ApiRestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：   订单后台管理控制器
 */
@RestController
@Api(tags = "订单后台管理模块")
public class OrderAdminController {

    @Autowired
    OrderService orderService;

    @ApiOperation("管理员订单列表")
    @PostMapping("/admin/order/list")
    public ApiRestResponse listForAdmin(@RequestParam Integer pageNum, Integer pageSize) {
        PageInfo pageInfo = orderService.listForAdmin(pageNum, pageSize);
        return ApiRestResponse.success(pageInfo);
    }

    //订单状态: 0用户已取消，10未付款（初始状态），20已付款，30已发货，40交易完成
    @ApiOperation("管理员发货")
    @PostMapping("/admin/order/delivered")
    public ApiRestResponse delivered(@RequestParam String orderNo) {
        orderService.delivered(orderNo);
        return ApiRestResponse.success();
    }

    //订单状态: 0用户已取消，10未付款（初始状态），20已付款，30已发货，40交易完成。管理员和用户都可以调用
    @ApiOperation("完结订单")
    @PostMapping("/order/finish")
    public ApiRestResponse finish(@RequestParam String orderNo) {
        orderService.finish(orderNo);
        return ApiRestResponse.success();
    }
}
