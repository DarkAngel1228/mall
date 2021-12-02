package com.macro.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.mapper.SmsHomeRecommendProductMapper;
import com.macro.mall.model.SmsHomeRecommendProduct;
import com.macro.mall.model.SmsHomeRecommendProductExample;
import com.macro.mall.service.SmsHomeRecommendProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class SmsHomeRecommendProductServiceImpl implements SmsHomeRecommendProductService {
    @Autowired
    private SmsHomeRecommendProductMapper recommendProductMapper;

    @Override
    public int create(List<SmsHomeRecommendProduct> recommendProductList) {
        for (SmsHomeRecommendProduct recommendProduct : recommendProductList) {
            recommendProduct.setRecommendStatus(0);
            recommendProduct.setSort(0);
            recommendProductMapper.insert(recommendProduct);
        }
        return recommendProductList.size();
    }

    @Override
    public int updateSort(Long id, Integer sort) {
        SmsHomeRecommendProduct record = new SmsHomeRecommendProduct();
        record.setSort(sort);
        record.setId(id);
        return recommendProductMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(List<Long> ids) {
        SmsHomeRecommendProductExample example = new SmsHomeRecommendProductExample();
        example.createCriteria().andIdIn(ids);
        return recommendProductMapper.deleteByExample(example);
    }

    @Override
    public int updateRecommendStatus(List<Long> ids, Integer recommendStatus) {
        SmsHomeRecommendProduct record = new SmsHomeRecommendProduct();
        record.setRecommendStatus(recommendStatus);
        SmsHomeRecommendProductExample example = new SmsHomeRecommendProductExample();
        example.createCriteria().andIdIn(ids);
        return recommendProductMapper.updateByExampleSelective(record, example);
    }

    @Override
    public List<SmsHomeRecommendProduct> list(String productName, Integer recommendStatus, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        SmsHomeRecommendProductExample example = new SmsHomeRecommendProductExample();
        SmsHomeRecommendProductExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(productName)) {
            criteria.andProductNameLike("%" + productName + "%");
        }
        if (recommendStatus != null) {
            criteria.andRecommendStatusEqualTo(recommendStatus);
        }
        example.setOrderByClause("sort desc");
        return recommendProductMapper.selectByExample(example);
    }
}
