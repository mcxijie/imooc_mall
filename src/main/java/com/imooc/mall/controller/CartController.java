package com.imooc.mall.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：   购物车Controller
 */
@Controller
@RequestMapping("/cart")
@Api(tags = "购物车模块")
public class CartController {

//    @ApiOperation("添加购物车")
//    @PostMapping("/add")
//    public ApiRestResponse add(@RequestParam Integer productId,@RequestParam Integer count){
//        return null;
//    }
}
