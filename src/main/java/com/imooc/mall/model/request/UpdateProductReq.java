package com.imooc.mall.model.request;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class UpdateProductReq {

    @NotNull(message = "id不能为null")
    private Integer id;

    private String name;

    private String image;

    private String detail;

    private Integer categoryId;

    @NotNull(message = "商品价格不能为null")
    @Min(value = 1, message = "价格不能小于1")
    private Integer price;

    @NotNull(message = "商品库存不能为null")
    @Max(value = 10000, message = "库存不能大于10000")
    private Integer stock;

    private Integer status;

}