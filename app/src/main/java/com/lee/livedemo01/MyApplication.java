package com.lee.livedemo01;

import android.app.Application;

import com.facebook.fresco.helper.Phoenix;

/**
 * @类名: ${type_name}
 * @功能描述:
 * @作者: ${user}
 * @时间: ${date}
 * @最后修改者:
 * @最后修改内容:
 */
public class MyApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        Phoenix.init(this);
    }
}
//jhfghfh