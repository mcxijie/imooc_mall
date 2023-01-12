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
    @PostMapping("admin/order/list")
    public ApiRestResponse listForAdmin(@RequestParam Integer pageNum, Integer pageSize) {
        PageInfo pageInfo = orderService.listForAdmin(pageNum, pageSize);
        return ApiRestResponse.success(pageInfo);
    }
}
