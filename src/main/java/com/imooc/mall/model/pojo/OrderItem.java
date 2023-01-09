package com.imooc.mall.model.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class OrderItem {
    private Integer id;

    private String orderNo;

    private Integer productId;

    private String productName;

    private String productImg;

    private Integer unitPrice;

    private Integer quantity;

    private Integer totalPrice;

    private Date createTime;

    private Date updateTime;

}