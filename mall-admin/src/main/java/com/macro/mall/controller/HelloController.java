package com.macro.mall.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.common.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "/a", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult login() {
        redisService.set("abc", "111");
        return CommonResult.failed();
    }

}
