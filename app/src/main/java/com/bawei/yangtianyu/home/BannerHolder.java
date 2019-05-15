package com.bawei.yangtianyu.home;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.bawei.yangtianyu.R;
import com.stx.xhb.xbanner.XBanner;


/**

 * 轮播的ViewHolder
 */
public class BannerHolder extends RecyclerView.ViewHolder {

    public XBanner banner;

    public BannerHolder(View itemView) {
        super(itemView);
        banner = itemView.findViewById(R.id.xbanner);
    }
}
