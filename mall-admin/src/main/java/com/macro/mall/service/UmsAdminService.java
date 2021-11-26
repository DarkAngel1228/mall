package com.macro.mall.service;

import com.macro.mall.dto.UmsAdminParam;
import com.macro.mall.dto.UpdateAdminPasswordParam;
import com.macro.mall.model.UmsAdmin;
import com.macro.mall.model.UmsResource;
import com.macro.mall.model.UmsRole;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UmsAdminService {
    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return token
     */
    String login(String username, String password);


    /**
     * 获取用户信息
     * @param username 用户名
     * @return 详情
     */
    UserDetails loadUserByUsername(String username);

    /**
     * 根据用户名获取后台管理员
     * @param username 用户名
     * @return 信息
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 获取指定用户的可访问资源
     * @param adminId 后台管理员id
     * @return url列表
     */
    List<UmsResource> getResourceList(Long adminId);

    /**
     * 注册
     * @param umsAdminParam 用户名/密码
     * @return token
     */
    UmsAdmin register(UmsAdminParam umsAdminParam);

    /**
     * 获取用户对应角色
     * @param adminId 后台管理员id
     * @return
     */
    List<UmsRole> getRoleList(Long adminId);

    /**
     * 根据用户名或昵称分页查询用户
     * @param keyword 关键字
     * @param pageSize 每页条数
     * @param pageNum 页码
     * @return adminList
     */
    List<UmsAdmin> list(String keyword, Integer pageSize, Integer pageNum);


    /**
     * 修改用户角色关系
     * @param adminId 管理员id
     * @param roleIds 角色id数组
     * @return count
     */
    @Transactional
    int updateRole(Long adminId, List<Long> roleIds);


    /**
     * 修改指定用户信息
     * @param adminId 管理员id
     * @param admin 管理员信息
     * @return count
     */
    int update(Long adminId, UmsAdmin admin);


    /**
     * 删除指定用户
     * @param adminId 管理员id
     * @return count
     */
    int delete(Long adminId);


    /**
     * 刷新token
     * @param oldToken 旧的token
     * @return 生成的jwt的token
     */
    String refreshToken(String oldToken);

    /**
     * 修改密码
     * @param updateAdminPasswordParam 密码
     * @return count
     */
    int updatePassword(UpdateAdminPasswordParam updateAdminPasswordParam);


    /**
     * 根据用户id获取用户
     * @param adminId 管理员id
     * @return 用户信息
     */
    UmsAdmin getItem(Long adminId);
}

