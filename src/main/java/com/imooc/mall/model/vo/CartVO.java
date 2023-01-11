package com.imooc.mall.model.vo;

import lombok.Data;

/**
 * 描述：   CartVO,给前端展示用
 */
@Data
public class CartVO {
    private Integer id;

    private Integer productId;

    private Integer userId;

    private Integer quantity;

    private Integer selected;

    private Integer price;

    private Integer productName;

    private String ProductImg;

}
