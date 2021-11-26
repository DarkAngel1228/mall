package com.macro.mall.service.impl;

import com.macro.mall.dao.UmsRoleDao;
import com.macro.mall.mapper.UmsRoleMapper;
import com.macro.mall.model.UmsMenu;
import com.macro.mall.model.UmsRole;
import com.macro.mall.model.UmsRoleExample;
import com.macro.mall.service.UmsRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsRoleServiceImpl implements UmsRoleService {
    @Autowired
    private UmsRoleDao roleDao;
    @Autowired
    private UmsRoleMapper roleMapper;


    @Override
    public List<UmsMenu> getMenuList(Long adminId) {
        return roleDao.getMenuList(adminId);
    }

    @Override
    public List<UmsRole> list() {
        return roleMapper.selectByExample(new UmsRoleExample());
    }
}
