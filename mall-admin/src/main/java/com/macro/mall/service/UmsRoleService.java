package com.macro.mall.service;

import com.macro.mall.model.UmsMenu;
import com.macro.mall.model.UmsRole;

import java.util.List;

public interface UmsRoleService {
    /**
     * 根据管理员id获取对应菜单
     * @param adminId 管理员id
     * @return menu
     */
    List<UmsMenu> getMenuList(Long adminId);

    /**
     * 获取所有角色列表
     * @return role
     */
    List<UmsRole> list();

    /**
     * 分页获取角色列表
     */
    List<UmsRole> list(String keyword, Integer pageSize, Integer pageNum);

}
