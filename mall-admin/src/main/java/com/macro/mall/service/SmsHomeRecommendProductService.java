package com.macro.mall.service;

import com.macro.mall.model.SmsHomeRecommendProduct;

import java.util.List;

public interface SmsHomeRecommendProductService {
    /**
     * 首页推荐商品创建
     */
    int create(List<SmsHomeRecommendProduct> recommendProductList);

    /**
     * 首页推荐商品 修改状态
     */
    int updateSort(Long id, Integer sort);

    /**
     * 首页推荐商品 删除
     */
    int delete(List<Long> ids);

    /**
     * 批量修改推荐状态
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * 分页查询推荐
     */
    List<SmsHomeRecommendProduct> list(String productName, Integer recommendStatus, Integer pageSize, Integer pageNum);
}
