package com.lagou.dao;

import com.lagou.domain.PromotionAd;

import java.util.List;

public interface PromotionAdMapper {

    /*
       分页查询广告信息
    */
    public List<PromotionAd> findAllPromotionAdByPage();

    /*
        新建广告
     */
    public void savePromotionAd(PromotionAd promotionAd);

    /*
        修改广告
     */
    public void updatePromotionAd(PromotionAd promotionAd);

    /*
        回显广告信息 根据id查询广告信息
     */
    public PromotionAd findPromotionAdById(int id);

    /*
       广告动态上下线
    */
    public void updatePromotionAdStatus(PromotionAd promotionAd);
}
