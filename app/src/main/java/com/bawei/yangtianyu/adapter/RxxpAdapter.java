package com.bawei.yangtianyu.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bawei.yangtianyu.R;
import com.bawei.yangtianyu.bean.HomeList;
import com.bawei.yangtianyu.home.RxxpItemHolder;
import com.bumptech.glide.Glide;

import java.util.List;

public class RxxpAdapter extends RecyclerView.Adapter<RxxpItemHolder> {

    private Context context;
    private List<HomeList.Commodity> rxxpList;

    public RxxpAdapter(Context context, List<HomeList.Commodity> rxxpList) {
        this.context = context;
        this.rxxpList = rxxpList;
    }

    @NonNull
    @Override
    public RxxpItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        return new RxxpItemHolder(inflater.inflate(R.layout.rxxp_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RxxpItemHolder holder, int position) {
        HomeList.Commodity commodity = rxxpList.get(position);
        holder.tvName.setText(commodity.commodityName);
        holder.tvPrice.setText(String.valueOf(commodity.price));
        Glide.with(context).load(commodity.masterPic).into(holder.icon);
    }

    @Override
    public int getItemCount() {
        return rxxpList.size();
    }
}
