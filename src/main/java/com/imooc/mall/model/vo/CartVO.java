package com.imooc.mall.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 描述：   CartVO,给前端展示用
 */
@Data
public class CartVO {
    @ApiModelProperty(value = "购物车id")
    private Integer id;

    @ApiModelProperty(value = "商品id")
    private Integer productId;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @ApiModelProperty(value = "商品数量")
    private Integer quantity;

    @ApiModelProperty(value = "是否已勾选：0代表未勾选，1代表已勾选")
    private Integer selected;

    @ApiModelProperty(value = "价格,单位-分")
    private Integer price;

    @ApiModelProperty(value = "总价")
    private Integer totalPrice;

    @ApiModelProperty(value = "商品名称")
    private String productName;

    @ApiModelProperty(value = "产品图片,相对路径地址")
    private String ProductImg;

}
