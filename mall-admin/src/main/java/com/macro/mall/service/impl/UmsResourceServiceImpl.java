package com.macro.mall.service.impl;

import com.macro.mall.mapper.UmsResourceMapper;
import com.macro.mall.model.UmsResource;
import com.macro.mall.model.UmsResourceExample;
import com.macro.mall.service.UmsResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsResourceServiceImpl implements UmsResourceService {
    @Autowired
    private UmsResourceMapper resourceMapper;

    @Override
    public int create(UmsResource umsResource) {
        return 0;
    }

    @Override
    public int update(Long id, UmsResource umsResource) {
        return 0;
    }

    @Override
    public UmsResource getItem(Long id) {
        return null;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public List<UmsResource> list(Long categoryId, String nameKeyword, String urlKeyword, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public List<UmsResource> listAll() {
        return resourceMapper.selectByExample(new UmsResourceExample());
    }
}