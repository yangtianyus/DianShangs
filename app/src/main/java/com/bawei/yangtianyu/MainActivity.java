package com.bawei.yangtianyu;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bawei.yangtianyu.adapter.MainPagerAdapter;
import com.bawei.yangtianyu.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mainPager;
    private TabLayout mainTab;

    private List<BaseFragment> fragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPager = findViewById(R.id.main_pager);
        mainTab = findViewById(R.id.main_tab);

        // 初始化页面
        fragmentList = new ArrayList<>();

        // 设置适配器
        mainPager.setAdapter(new MainPagerAdapter(getSupportFragmentManager(), fragmentList));
        // 让Page和tab关联
        mainTab.setupWithViewPager(mainPager);

    }
}
