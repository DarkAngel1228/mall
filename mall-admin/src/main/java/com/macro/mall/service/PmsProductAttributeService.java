package com.macro.mall.service;

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
     * 根据商品分类的id获取商品属性及属性分类
     * @param productCategoryId 分类id
     * @return list
     */
    List<ProductAttrInfo> getProductAttrInfo(Long productCategoryId);


}
