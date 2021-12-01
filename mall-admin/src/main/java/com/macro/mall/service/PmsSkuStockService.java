package com.macro.mall.service;

import com.macro.mall.model.PmsSkuStock;

import java.util.List;

public interface PmsSkuStockService {
    /**
     * 根据产品id和skuCode模糊搜索
     * @return list
     */
    List<PmsSkuStock> getList(Long id, String keyword);

    /**
     * 批量更新商品库存信息
     */
    int update(Long id, List<PmsSkuStock> skuStockList);
}
