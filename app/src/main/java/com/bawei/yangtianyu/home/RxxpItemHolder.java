package com.bawei.yangtianyu.home;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.yangtianyu.R;


public class RxxpItemHolder extends RecyclerView.ViewHolder {

    public ImageView icon;
    public TextView tvName;
    public TextView tvPrice;

    public RxxpItemHolder(View itemView) {
        super(itemView);
        icon = itemView.findViewById(R.id.iv_icon);
        tvName = itemView.findViewById(R.id.tv_desc);
        tvPrice = itemView.findViewById(R.id.tv_price);
    }
}
