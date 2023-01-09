package com.imooc.mall.model.request;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 描述：   AddCategoryReq
 */
@Data
public class AddCategoryReq {
    @Size(min = 2, max = 5)
    @NotNull(message = "name不能为null")
    private String name;

    @NotNull(message = "type不能为null")
    @Max(3)
    private Integer type;

    @NotNull(message = "parentId不能为null")
    private Integer parentId;

    @NotNull(message = "orderNum不能为null")
    private Integer orderNum;

}
