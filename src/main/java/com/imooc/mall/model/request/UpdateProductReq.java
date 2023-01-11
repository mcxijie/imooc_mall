package com.imooc.mall.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class UpdateProductReq {

    @ApiModelProperty(value = "商品主键id")
    @NotNull(message = "id不能为null")
    private Integer id;

    @ApiModelProperty(value = "商品名称")
    private String name;

    @ApiModelProperty(value = "产品图片,相对路径地址")
    private String image;

    @ApiModelProperty(value = "商品详情")
    private String detail;

    @ApiModelProperty(value = "分类id")
    private Integer categoryId;

    @ApiModelProperty(value = "价格,单位-分")
    @NotNull(message = "商品价格不能为null")
    @Min(value = 1, message = "价格不能小于1")
    private Integer price;

    @ApiModelProperty(value = "库存数量")
    @NotNull(message = "商品库存不能为null")
    @Max(value = 10000, message = "库存不能大于10000")
    private Integer stock;

    @ApiModelProperty(value = "商品上架状态：0-下架，1-上架")
    private Integer status;

}