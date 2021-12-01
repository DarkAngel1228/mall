package com.macro.mall.service;

import com.macro.mall.model.CmsSubject;

import java.util.List;

public interface CmsSubjectService {

    /**
     * 获取全部商品专题
     * @return list
     */
    List<CmsSubject> listAll();

    /**
     * 根据专题名称分页获取商品专题
     * @param keyword 关键字
     * @param pageNum 页码
     * @param pageSize 条数
     * @return list
     */
    List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize);
}
