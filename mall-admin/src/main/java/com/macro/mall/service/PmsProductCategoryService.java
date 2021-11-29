package com.macro.mall.service;

import com.macro.mall.dto.PmsProductCategoryParam;
import com.macro.mall.dto.PmsProductCategoryWithChildrenItem;
import com.macro.mall.model.PmsProductCategory;

import java.util.List;

public interface PmsProductCategoryService {
    /**
     * 创建产品分类
     * @param productCategoryParam param
     * @return 分类
     */
    int create(PmsProductCategoryParam productCategoryParam);

    /**
     * 更新产品分类
     * @param id 主键id
     * @param productCategoryParam param
     * @return 分类
     */
    int update(Long id, PmsProductCategoryParam productCategoryParam);

    /**
     * 获取商品分类列表
     * @param parentId 父类id
     * @param pageSize 页数
     * @param pageNum 页码
     * @return list
     */
    List<PmsProductCategory> getList(Long parentId, Integer pageSize, Integer pageNum);


    /**
     * 获取商品分类详情
     * @param id 主键id
     * @return 分类
     */
    PmsProductCategory getItem(Long id);

    /**
     * 删除商品
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改导航栏显示状态
     * @param ids 数组
     * @param navStatus 状态
     * @return int
     */
    int updateNavStatus(List<Long> ids, Integer navStatus);

    /**
     * 修改显示状态
     * @param ids 数组
     * @param showStatus 显示状态`
     * @return int
     */
    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * 查询所有一级分类及子分类
     * @return tree
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
