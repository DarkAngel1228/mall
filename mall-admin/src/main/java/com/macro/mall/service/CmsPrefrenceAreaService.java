package com.macro.mall.service;

import com.macro.mall.model.CmsPrefrenceArea;

import java.util.List;

/**
 * 商品优选管理
 */
public interface CmsPrefrenceAreaService {
    /**
     * 获取所有优选专区
     * @return list
     */
    List<CmsPrefrenceArea> listAll();
}
