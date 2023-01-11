package com.imooc.mall.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ProductListReq {
    @ApiModelProperty(value = "关键字")
    private String keyword;

    @ApiModelProperty(value = "分类id")
    private Integer categoryId;

    @ApiModelProperty(value = "排序")
    private String orderBy;

    @ApiModelProperty(value = "当前页数")
    private Integer pageNum = 1;

    @ApiModelProperty(value = "每页数量")
    private Integer pageSize = 10;

}