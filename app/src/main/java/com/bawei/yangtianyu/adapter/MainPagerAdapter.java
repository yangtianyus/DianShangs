package com.bawei.yangtianyu.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.bawei.yangtianyu.base.BaseFragment;

import java.util.List;


public class MainPagerAdapter extends FragmentPagerAdapter {

    private List<BaseFragment> fragmentList;
    private String[] tabTitle = {"首页", "分类", "圈子", "购物车", "个人信息"};

    public MainPagerAdapter(FragmentManager fm, List<BaseFragment> fragments) {
        super(fm);
        this.fragmentList = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }
}
