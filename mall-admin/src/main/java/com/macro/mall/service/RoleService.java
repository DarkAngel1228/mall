package com.macro.mall.service;

import com.macro.mall.model.UmsMenu;

import java.util.List;

public interface RoleService {
    /**
     * 根据管理员id获取对应菜单
     * @param adminId 管理员id
     * @return menu
     */
    List<UmsMenu> getMenuList(Long adminId);

}
