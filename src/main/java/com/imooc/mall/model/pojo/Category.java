package com.imooc.mall.model.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class Category {
    @ApiModelProperty(value = "主键")
    private Integer id;

    @ApiModelProperty(value = "分类目录名称")
    private String name;

    @ApiModelProperty(value = "分类目录级别，例如1代表一级，2代表二级，3代表三级")
    private Integer type;

    @ApiModelProperty(value = "父id，也就是上一级目录的id，如果是一级目录，那么父id为0")
    private Integer parentId;

    @ApiModelProperty(value = "目录展示时的排序")
    private Integer orderNum;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

}