package com.imooc.mall.controller;

import com.imooc.mall.Service.CartService;
import com.imooc.mall.common.ApiRestResponse;
import com.imooc.mall.filter.UserFilter;
import com.imooc.mall.model.vo.CartVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/list")
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

    @ApiOperation("更新购物车")
    @PostMapping("/update")
    public ApiRestResponse<List<CartVO>> update(@RequestParam Integer productId, @RequestParam Integer count) {
        List<CartVO> cartVOList = cartService.update(UserFilter.currentUser.getId(), productId, count);
        return ApiRestResponse.success(cartVOList);
    }

    @ApiOperation("删除购物车")
    @PostMapping("/delete")
    public ApiRestResponse<List<CartVO>> delete(@RequestParam Integer productId) {
        //不能传入UserId
        List<CartVO> cartVOList = cartService.delete(UserFilter.currentUser.getId(), productId);
        return ApiRestResponse.success(cartVOList);
    }

    @ApiOperation("选中/不选中购物车的某商品")
    @PostMapping("/select")
    public ApiRestResponse<List<CartVO>> select(@RequestParam Integer productId, @RequestParam Integer selected) {
        //不能传入UserId
        List<CartVO> cartVOList = cartService.selectOrNot(UserFilter.currentUser.getId(), productId, selected);
        return ApiRestResponse.success(cartVOList);
    }

    @ApiOperation("全部选中/全部不选中购物车的某商品")
    @PostMapping("/selectAll")
    public ApiRestResponse<List<CartVO>> selectAll(@RequestParam Integer selected) {
        //不能传入UserId
        List<CartVO> cartVOList = cartService.selectAllOrNot(UserFilter.currentUser.getId(), selected);
        return ApiRestResponse.success(cartVOList);
    }
}
