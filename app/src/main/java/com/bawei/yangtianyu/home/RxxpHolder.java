package com.bawei.yangtianyu.home;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.bawei.yangtianyu.R;


/**

 * 热销新品ViewHolder
 */
public class RxxpHolder extends RecyclerView.ViewHolder {

    public TextView tvTag;
    public RecyclerView rxxpList;

    public RxxpHolder(View itemView) {
        super(itemView);

        tvTag = itemView.findViewById(R.id.tv_tag);
        rxxpList = itemView.findViewById(R.id.rxxp_list);
    }
}
