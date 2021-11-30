package com.macro.mall.service;

import com.macro.mall.dto.PmsProductAttributeCategoryItem;
import com.macro.mall.model.PmsProductAttribute;
import com.macro.mall.model.PmsProductAttributeCategory;

import java.util.List;

public interface PmsProductAttributeCategoryService {
    /**
     * 创建属性分类
     * @param name 分类名称
     * @return int
     */
    int create(String name);

    /**
     * 修改属性分类
     * @param id 主键id
     * @param name 名字
     * @return int
     */
    int update(Long id, String name);

    /**
     * 删除属性分类
     * @param id 主键id
     * @return int
     */
    int delete(Long id);

    /**
     * 获取单个商品属性分类信息
     * @param id 主键id
     * @return PmsProductAttributeCategory
     */
    PmsProductAttributeCategory getItem(Long id);

    /**
     * 分页获取所有商品属性分类
     * @param pageSize 条数
     * @param pageNum 页码
     * @return list
     */
    List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum);

    /**
     * 获取所有商品属性分类及其下属性
     * @return list
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
