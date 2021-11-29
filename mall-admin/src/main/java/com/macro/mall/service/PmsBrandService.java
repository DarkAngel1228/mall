package com.macro.mall.service;

import com.macro.mall.dto.PmsBrandParam;
import com.macro.mall.model.PmsBrand;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PmsBrandService {
    /**
     * 获取所有品牌
     * @return brand
     */
    List<PmsBrand> listAllBrand();

    /**
     * 创建品牌
     * @return brand
     */
    int createBrand(PmsBrandParam pmsBrand);


    /**
     * 更新品牌
     * @param id 主键
     * @param pmsBrand brand
     * @return brand
     */
    @Transactional
    int updateBrand(Long id, PmsBrandParam pmsBrand);

    /**
     * 删除品牌
     * @param id 主键
     * @return int
     */
    int deleteBrand(Long id);

    /**
     * 品牌列表
     * @param keyword 关键字
     * @param pageNum 页码
     * @param pageSize 条数
     * @return brand
     */
    List<PmsBrand> listBrand(String keyword, Integer pageNum, Integer pageSize);

    /**
     * 获取商品详情
     * @param id 主键id
     * @return brand
     */
    PmsBrand getBrand(Long id);


    /**
     * 批量删除品牌
     * @param ids 主键数组
     * @return int
     */
    int deleteBrand(List<Long> ids);

    /**
     * 更新品牌
     * @param ids 主键数组
     * @param showStatus 状态
     * @return int
     */
    int updateShowStatus(List<Long> ids, Integer showStatus);


    /**
     * 批量更新厂家制造商状态
     * @param ids 主键数组
     * @param factoryStatus 状态
     * @return int
     */
    int updateFactoryStatus(List<Long> ids, Integer factoryStatus);
}
