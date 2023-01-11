package com.imooc.mall.controller;

import com.imooc.mall.Service.CartService;
import com.imooc.mall.common.ApiRestResponse;
import com.imooc.mall.filter.UserFilter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：   购物车Controller
 */
@RestController
@RequestMapping("/cart")
@Api(tags = "购物车模块")
public class CartController {

    @Autowired
    CartService cartService;

    @ApiOperation("添加商品购物车")
    @PostMapping("/add")
    public ApiRestResponse add(@RequestParam Integer productId, @RequestParam Integer count) {
        cartService.add(UserFilter.currentUser.getId(), productId, count);
        return ApiRestResponse.success();
    }
}
