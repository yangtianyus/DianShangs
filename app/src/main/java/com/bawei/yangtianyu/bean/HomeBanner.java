package com.bawei.yangtianyu.bean;

import com.stx.xhb.xbanner.entity.SimpleBannerInfo;

import java.util.List;

/**
 * 首页轮播Bean
 */
public class HomeBanner {

    public String message;
    public String status;
    public List<BannerItem> result;

    public static class BannerItem extends SimpleBannerInfo {
        public String imageUrl;
        public String jumpUrl;
        public int rank;
        public String title;

        @Override
        public String getXBannerUrl() {
            return imageUrl;
        }
    }
}
