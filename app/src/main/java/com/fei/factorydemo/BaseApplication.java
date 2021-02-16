package com.fei.factorydemo;

import android.app.Application;

import com.fei.factorydemo.simple1.PreferenceUtils;

/**
 * @ClassName: BaseApplication
 * @Description: java类作用描述
 * @Author: Fei
 * @CreateDate: 2021-02-16 15:00
 * @UpdateUser: 更新者
 * @UpdateDate: 2021-02-16 15:00
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        PreferenceUtils.getInstance().init(this);
    }
}
