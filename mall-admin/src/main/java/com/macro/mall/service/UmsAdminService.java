package com.macro.mall.service;

import com.macro.mall.dto.UmsAdminParam;
import com.macro.mall.model.UmsAdmin;
import com.macro.mall.model.UmsResource;
import org.springframework.security.core.userdetails.UserDetails;

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


}

