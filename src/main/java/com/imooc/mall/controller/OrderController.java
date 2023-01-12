package com.imooc.mall.controller;

import com.github.pagehelper.PageInfo;
import com.imooc.mall.Service.OrderService;
import com.imooc.mall.common.ApiRestResponse;
import com.imooc.mall.model.request.CreateOrderReq;
import com.imooc.mall.model.vo.OrderVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 描述：   订单控制器
 */
@RestController
@Api(tags = "订单模块")
public class OrderController {

    @Autowired
    OrderService orderService;

    @ApiOperation("创建订单")
    @PostMapping("order/create")
    public ApiRestResponse<String> create(@RequestBody CreateOrderReq createOrderReq) {
        String orderNo = orderService.create(createOrderReq);
        return ApiRestResponse.success(orderNo);
    }

    @ApiOperation("前台订单详情")
    @GetMapping("order/detail")
    public ApiRestResponse<OrderVO> detail(@RequestParam String orderNo) {
        OrderVO orderVO = orderService.detail(orderNo);
        return ApiRestResponse.success(orderVO);
    }

    @ApiOperation("前台订单列表")
    @GetMapping("order/list")
    public ApiRestResponse list(Integer pageNum, Integer pageSize) {
        PageInfo pageInfo = orderService.listForCustmer(pageNum, pageSize);
        return ApiRestResponse.success(pageInfo);
    }


}
