package com.imooc.mall.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 描述：   UpdateCategoryReq
 */
@Data
public class UpdateCategoryReq {

    @ApiModelProperty(value = "主键")
    @NotNull(message = "id不能为null")
    private Integer id;

    @ApiModelProperty(value = "分类目录名称")
    @Size(min = 2, max = 5)
    private String name;

    @ApiModelProperty(value = "分类目录级别，例如1代表一级，2代表二级，3代表三级")
    @Max(3)
    private Integer type;

    @ApiModelProperty(value = "父id，也就是上一级目录的id，如果是一级目录，那么父id为0")
    private Integer parentId;

    @ApiModelProperty(value = "目录展示时的排序")
    private Integer orderNum;

}
