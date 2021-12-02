package com.macro.mall.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.PmsSkuStock;
import com.macro.mall.service.PmsSkuStockService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "PmsSkuStockController", description = "sku商品库存管理")
@RequestMapping(value = "/sku")
public class PmsSkuStockController {
    @Autowired
    private PmsSkuStockService skuStockService;

    @ApiOperation("根据商品编号及sku编码模糊搜索sku库存")
    @GetMapping(value = "/{pid}")
    @ResponseBody
    public CommonResult<List<PmsSkuStock>> getList(@PathVariable Long pid,
                                                   @RequestParam(value = "keyword", required = false) String keyword) {
        List<PmsSkuStock> skuStockList = skuStockService.getList(pid, keyword);
        return CommonResult.success(skuStockList);
    }

    @ApiOperation("批量更新sku库存信息")
    @PostMapping(value = "/update/{pid}")
    @ResponseBody
    public CommonResult update(@PathVariable Long pid, @RequestBody List<PmsSkuStock> skuStockList) {
        int count = skuStockService.update(pid, skuStockList);
        if(count>0){
            return CommonResult.success(count);
        }else{
            return CommonResult.failed();
        }
    }
}