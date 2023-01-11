package com.imooc.mall.controller;

import com.imooc.mall.Service.ProductService;
import com.imooc.mall.common.ApiRestResponse;
import com.imooc.mall.model.pojo.Product;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：   前台商品Controller
 */

@RestController
@Api(tags = "前台商品模块")
public class ProducController {
    @Autowired
    ProductService productService;

    @ApiOperation("商品详情")
    @PostMapping("product/detail")
    public ApiRestResponse detail(@RequestParam Integer id) {
        Product product = productService.detail(id);
        return ApiRestResponse.success(product);
    }
}
