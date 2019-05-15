package com.bawei.yangtianyu.mvp;

import com.bawei.yangtianyu.net.Callback;

public class HomePresenterImpl implements IHomeContract.IHomePresenter {
    private IHomeContract.IHomeView view;
    private IHomeContract.IHomeModel model;

    @Override
    public void attach(IHomeContract.IHomeView view) {
        this.view = view;
        // 创建Model
        model = new HomeModelImpl();
    }

    @Override
    public void detach() {
        if (view != null) {
            view = null;
        }
        if (model != null) {
            model = null;
        }
    }

    @Override
    public void getBanner(String url) {
        model.doHttpGet(url, new Callback() {
            @Override
            public void onSuccess(String result) {
                view.showBanner(result);
            }
            @Override
            public void onError(String msg) {

            }
        });
    }

    @Override
    public void getList(String url) {
        model.doHttpGet(url, new Callback() {
            @Override
            public void onSuccess(String result) {
                view.showList(result);
            }

            @Override
            public void onError(String msg) {

            }
        });
    }
}
