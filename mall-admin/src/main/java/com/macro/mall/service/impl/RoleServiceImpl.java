package com.macro.mall.service.impl;

import com.macro.mall.dao.UmsRoleDao;
import com.macro.mall.model.UmsMenu;
import com.macro.mall.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private UmsRoleDao roleDao;


    @Override
    public List<UmsMenu> getMenuList(Long adminId) {
        return roleDao.getMenuList(adminId);
    }
}
