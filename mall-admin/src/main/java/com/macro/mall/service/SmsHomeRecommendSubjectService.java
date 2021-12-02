package com.macro.mall.service;

import com.macro.mall.model.SmsHomeRecommendSubject;

import java.util.List;

public interface SmsHomeRecommendSubjectService {
    /**
     * 添加首页推荐专题
     */
    int create(List<SmsHomeRecommendSubject> homeRecommendSubjectList);

    /**
     * 修改推荐排序
     */
    int updateSort(Long id, Integer sort);

    /**
     * 批量删除推荐
     */
    int delete(List<Long> ids);

    /**
     * 批量更新推荐状态
     */
    int updateRecommendStatus(List<Long> ids, Integer status);

    /**
     * 分页查询推荐
     */
    List<SmsHomeRecommendSubject> list(String subjectName, Integer recommendStatus, Integer pageSize, Integer pageNum);
}
