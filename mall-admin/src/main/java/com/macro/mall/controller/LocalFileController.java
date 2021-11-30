package com.macro.mall.controller;

import com.macro.mall.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@Api(tags = "LocalFileController", description = "本地上传管理")
@RequestMapping("/file/local")
public class LocalFileController {
    @Value("${file.path}")
    private String dirPath;
    @GetMapping(value = "/file")
    public String file() {

        return "file";
    }

    @ApiOperation(value = "本地上传接口")
    @PostMapping(value = "/upload")
    @ResponseBody
    public CommonResult fileUpload(@RequestParam(value = "file") MultipartFile file, Model model, HttpServletRequest request) {
        if (file.isEmpty()) {
            System.out.println("文件为空空");
        }
        String fileName = file.getOriginalFilename();  // 文件名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        //String filePath = System.getProperty("user.dir") + "/images/"; // 上传后的路径
        fileName = UUID.randomUUID() + suffixName; // 新文件名
        System.out.println(dirPath);
        File dest = new File(dirPath + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        model.addAttribute("filename", fileName);
        Map<String, String> fileMap = new HashMap<>();
        fileMap.put("url", "http://localhost:8088/" + fileName);
        fileMap.put("name", fileName);
        return CommonResult.success(fileMap);
    }
}
