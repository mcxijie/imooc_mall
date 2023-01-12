package com.imooc.mall.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class OrderItemVO {

    @ApiModelProperty(value = "归属订单id")
    private String orderNo;

    @ApiModelProperty(value = "商品id")
    private Integer productId;

    @ApiModelProperty(value = "商品名称")
    private String productName;

    @ApiModelProperty(value = "商品图片")
    private String productImg;

    @ApiModelProperty(value = "单价（下单时的快照）")
    private Integer unitPrice;

    @ApiModelProperty(value = "商品数量")
    private Integer quantity;

    @ApiModelProperty(value = "商品总价")
    private Integer totalPrice;

}
