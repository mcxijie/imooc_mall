package com.imooc.mall.controller;

import com.imooc.mall.Service.CartService;
import com.imooc.mall.common.ApiRestResponse;
import com.imooc.mall.filter.UserFilter;
import com.imooc.mall.model.vo.CartVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述：   购物车Controller
 */
@RestController
@RequestMapping("/cart")
@Api(tags = "购物车模块")
public class CartController {

    @Autowired
    CartService cartService;

    @ApiOperation("购物车列表")
    @PostMapping("/list")
    public ApiRestResponse<List<CartVO>> add() {
        //内部获取用户ID，防止横向越权
        List<CartVO> cartVOList = cartService.list(UserFilter.currentUser.getId());
        return ApiRestResponse.success(cartVOList);
    }

    @ApiOperation("添加商品购物车")
    @PostMapping("/add")
    public ApiRestResponse<List<CartVO>> add(@RequestParam Integer productId, @RequestParam Integer count) {
        List<CartVO> cartVOList = cartService.add(UserFilter.currentUser.getId(), productId, count);
        return ApiRestResponse.success(cartVOList);
    }
}
