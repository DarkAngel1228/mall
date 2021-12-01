package com.macro.mall.service;

import com.macro.mall.dto.PmsProductAttributeParam;
import com.macro.mall.dto.ProductAttrInfo;
import com.macro.mall.model.PmsProductAttribute;

import java.util.List;

public interface PmsProductAttributeService {
    /**
     * 根据分类分页获取商品属性
     * @param cid 分类id
     * @param type 0->规格 1->参数
     * @param pageSize 条数
     * @param pageNum 页码
     * @return list
     */
    List<PmsProductAttribute> getList(Long cid, Integer type, Integer pageSize, Integer pageNum);

    /**
     * 创建商品属性
     * @param productAttributeParam 商品属性
     * @return int
     */
    int create(PmsProductAttributeParam productAttributeParam);

    /**
     * 修改商品属性
     * @param id 主键id
     * @param productAttributeParam 商品属性
     * @return int
     */
    int update(Long id, PmsProductAttributeParam productAttributeParam);

    /**
     * 获取单个商品属性
     * @param id 主键
     * @return 商品属性
     */
    PmsProductAttribute getItem(Long id);


    /**
     * 批量删除商品属性
     * @param ids 主键id数组
     * @return int
     */
    int delete(List<Long> ids);

    /**
     * 根据商品分类的id获取商品属性及属性分类
     * @param productCategoryId 分类id
     * @return list
     */
    List<ProductAttrInfo> getProductAttrInfo(Long productCategoryId);



}
