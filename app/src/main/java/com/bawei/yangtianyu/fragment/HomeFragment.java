package com.bawei.yangtianyu.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.bawei.yangtianyu.Api;
import com.bawei.yangtianyu.R;
import com.bawei.yangtianyu.base.BaseFragment;
import com.bawei.yangtianyu.bean.HomeBanner;
import com.bawei.yangtianyu.bean.HomeList;
import com.bawei.yangtianyu.mvp.HomePresenterImpl;
import com.bawei.yangtianyu.mvp.IHomeContract;
import com.google.gson.Gson;



/**
 * Description: 首页Fragment
 */
public class HomeFragment extends BaseFragment implements IHomeContract.IHomeView {

    private static final String TAG = HomeFragment.class.getSimpleName();

    private IHomeContract.IHomePresenter presenter;

    private RecyclerView recyclerView;  // 声明首页列表


    protected int setView() {
        return R.layout.home_fragment;
    }

    @Override
    protected void bindView(View view) {
        recyclerView = view.findViewById(R.id.home_recycle_view);

        // 设置布局管理
        recyclerView.setLayoutManager(new LinearLayoutManager(mActivity));


        presenter = new HomePresenterImpl();
        presenter.attach(this);
    }


    @Override
    protected void initData() {
        presenter.getBanner(Api.home_banner);
        presenter.getList(Api.home_list);
    }

    @Override
    public void showBanner(String data) {
        Log.i(TAG, "Banner:" + data);
        Gson gson = new Gson();
        HomeBanner homeBanner = gson.fromJson(data, HomeBanner.class);


    }

    @Override
    public void showList(String data) {
        Log.i(TAG, "List" + data);
        Gson gson = new Gson();
        HomeList homeList = gson.fromJson(data, HomeList.class);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.detach();
    }
}
