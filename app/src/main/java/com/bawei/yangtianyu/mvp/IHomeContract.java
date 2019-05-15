package com.bawei.yangtianyu.mvp;


import com.bawei.yangtianyu.net.Callback;

public interface IHomeContract {

    interface IHomeView {

        void showBanner(String data);

        void showList(String data);
    }

    interface IHomeModel {

        void doHttpGet(String url, Callback callback);
    }

    interface IHomePresenter {

        // 绑定和解绑
        void attach(IHomeView view);

        void detach();

        void getBanner(String url);

        void getList(String url);
    }
}
