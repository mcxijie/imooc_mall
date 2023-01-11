package com.imooc.mall.model.query;

import lombok.Data;

import java.util.List;

/**
 * 描述：   前台商品列表的Query
 */
@Data
public class ProductListQuery {
    List<Integer> categoryIds;
    private String keyword;
}
