package com.bawei.yangtianyu.net;


import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.bawei.yangtianyu.MyApplication;

import java.util.Map;

/*
网络工具类
 */
public class HttpUtil {
    private static final HttpUtil ourInstance = new HttpUtil();

    public static HttpUtil getInstance() {
        return ourInstance;
    }

    private HttpUtil() {
    }

    public void doVolleyGet(String url, final Callback callback) {

        StringRequest request = new StringRequest(
                Request.Method.GET,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        callback.onSuccess(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        callback.onError(error.getMessage());
                    }
                }
        );
        // 标记TAG
        request.setTag("gettag");
        // 添加到请求队列
        MyApplication.getQueue().add(request);
    }

    public void doVolleyPost(String url, final Map<String, String> param, final Callback callback) {
        StringRequest request = new StringRequest(
                Request.Method.POST,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        callback.onSuccess(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        callback.onError(error.getMessage());
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return param;
            }
        };

        // 标记tag
        request.setTag("posttag");
        MyApplication.getQueue().add(request);
    }
}
