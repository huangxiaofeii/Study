package ztk.application;

import android.app.Application;

import org.xutils.x;

import cn.zz.study.BuildConfig;

/**
 * Created by HuangXiaofei on 2018.10.9.
 */

public class StuApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //region  初始化xUtils

        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG); // 是否输出debug日志, 开启debug会影响性能.

        //endregion



    }
}
