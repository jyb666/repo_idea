package com.lagou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lagou.dao.PromotionAdMapper;
import com.lagou.domain.PromotionAd;
import com.lagou.domain.PromotionAdVO;
import com.lagou.service.PromotionAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PromotionAdServiceImpl implements PromotionAdService {

    @Autowired
    private PromotionAdMapper promotionAdMapper;


    @Override
    public PageInfo<PromotionAd> findAllPromotionAdByPage(PromotionAdVO promotionAdVO) {

        PageHelper.startPage(promotionAdVO.getCurrentPage(),promotionAdVO.getPageSize());
        List<PromotionAd> allPromotionAdByPage = promotionAdMapper.findAllPromotionAdByPage();

        PageInfo<PromotionAd> pageInfo = new PageInfo<>(allPromotionAdByPage);

        return pageInfo;
    }

    /*
        新建广告
     */
    @Override
    public void savePromotionAd(PromotionAd promotionAd) {
        // 调用mapper方法
        promotionAdMapper.savePromotionAd(promotionAd);
    }

    /*
        修改广告
     */
    @Override
    public void updatePromotionAd(PromotionAd promotionAd) {
        // 调用mapper方法
        promotionAdMapper.updatePromotionAd(promotionAd);
    }

    /*
        回显广告信息 根据id查询广告信息
     */
    @Override
    public PromotionAd findPromotionAdById(int id) {

        // 调用mapper
        PromotionAd promotionAdById = promotionAdMapper.findPromotionAdById(id);
        return promotionAdById;
    }

    /*
        广告动态上下线
     */
    @Override
    public void updatePromotionAdStatus(int id, int status) {
        // 封装数据
        PromotionAd promotionAd = new PromotionAd();
        promotionAd.setId(id);
        promotionAd.setStatus(status);
        promotionAd.setUpdateTime(new Date());

        // 调用mapper
        promotionAdMapper.updatePromotionAdStatus(promotionAd);
    }
}
