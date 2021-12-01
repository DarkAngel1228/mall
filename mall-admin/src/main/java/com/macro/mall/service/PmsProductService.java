package com.macro.mall.service;

import com.macro.mall.dto.PmsProductParam;
import com.macro.mall.dto.PmsProductQueryParam;
import com.macro.mall.dto.PmsProductResult;
import com.macro.mall.model.PmsProduct;

import java.util.List;

public interface PmsProductService {
    /**
     * 创建商品
     * @param productParam 商品参数
     * @return int
     */
    int create(PmsProductParam productParam);

    /**
     * 根据商品id获取商品编辑信息
     * @param id 主键
     * @return info
     */
    PmsProductResult getUpdateInfo(Long id);

    /**
     * 更新商品
     * @param id 主键id
     * @param productParam 商品
     * @return int
     */
    int update(Long id, PmsProductParam productParam);

    /**
     * 分页查询商品
     * @param productQueryParam 查询参数
     * @param pageSize 条数
     * @param pageNum 页码
     * @return productList
     */
    List<PmsProduct> list(PmsProductQueryParam productQueryParam, Integer pageSize, Integer pageNum);

    /**
     * 根据商品名称或者货号模糊查询
     * @param keyword 关键字
     * @return list
     */
    List<PmsProduct> list(String keyword);

    /**
     * 批量修改审核状态
     * @param ids 产品id数组
     * @param verifyStatus 审核状态
     * @param detail 备注
     * @return int
     */
    int updateVerifyStatus(List<Long> ids, Integer verifyStatus, String detail);

    /**
     * 批量上下架
     * @param ids 产品id数组
     * @param publishStatus 发布状态
     * @return int
     */
    int updatePublishStatus(List<Long> ids, Integer publishStatus);


    /**
     * 批量修改商品推荐状态
     * @param ids 产品id数组
     * @param recommendStatus 推荐状态
     * @return int
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * 批量修改删除状态
     * @param ids 产品id数组
     * @param deleteStatus 删除状态
     * @return int
     */
    int updateDeleteStatus(List<Long> ids, Integer deleteStatus);

    /**
     * 批量修改新品状态
     * @param ids 产品id数组
     * @param newStatus 新品状态
     * @return int
     */
    int updateNewStatus(List<Long> ids, Integer newStatus);
}
