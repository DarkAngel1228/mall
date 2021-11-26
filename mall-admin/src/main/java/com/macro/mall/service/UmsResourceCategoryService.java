package com.macro.mall.service;

import com.macro.mall.model.UmsMemberReceiveAddress;
import com.macro.mall.model.UmsResourceCategory;

import java.util.List;

public interface UmsResourceCategoryService {

    /**
     * 获取所有资源分类
     * @return
     */
    List<UmsResourceCategory> listAll();

    /**
     * 创建资源分类
     * @param umsResourceCategory 资源分类
     * @return count
     */
    int create(UmsResourceCategory umsResourceCategory);

    /**
     * 修改资源分类
     * @param id 资源分类id
     * @param umsResourceCategory 资源分类
     * @return 资源分类
     */
    int update(Long id, UmsResourceCategory umsResourceCategory);


    /**
     * 删除资源分类
     * @param id 资源分类id
     * @return count
     */
    int delete(Long id);
}
