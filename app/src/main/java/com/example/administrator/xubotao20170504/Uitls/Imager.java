package com.example.administrator.xubotao20170504.Uitls;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * 用途：
 * 作者：xuBoTao
 * 时间：2017/5/4 10:15
 */

public class Imager extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderConfiguration build = new ImageLoaderConfiguration.Builder(this).build();
        ImageLoader.getInstance().init(build);
    }
}
