package com.bawei.yangtianyu.mvp;


import com.bawei.yangtianyu.net.Callback;
import com.bawei.yangtianyu.net.HttpUtil;


public class HomeModelImpl implements IHomeContract.IHomeModel {

    private HttpUtil util;

    public HomeModelImpl() {
        util = HttpUtil.getInstance();
    }

    @Override
    public void doHttpGet(String url, Callback callback) {
        util.doVolleyGet(url, callback);
    }
}
