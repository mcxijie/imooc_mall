package com.imooc.mall.Service;

import com.imooc.mall.model.pojo.Category;
import com.imooc.mall.model.request.AddCategoryReq;

/**
 * 描述：   分类目录Service
 */
public interface CategoryService {
    void add(AddCategoryReq addCategoryReq);

    void update(Category updateCategory);
}
