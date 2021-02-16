package com.fei.factorydemo.simple1;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * @ClassName: PreferenceUtils
 * @Description: java类作用描述
 * @Author: Fei
 * @CreateDate: 2021-02-16 14:41
 * @UpdateUser: 更新者
 * @UpdateDate: 2021-02-16 14:41
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class PreferenceUtils {

    private static volatile PreferenceUtils mInstances;
    private SharedPreferences mSharePreferences;
    private SharedPreferences.Editor mEditor;

    private PreferenceUtils() {

    }

    public static PreferenceUtils getInstance() {
        if (mInstances == null) {
            synchronized (PreferenceUtils.class) {
                if (mInstances == null) {
                    mInstances = new PreferenceUtils();
                }
            }
        }
        return mInstances;
    }

    public void init(Context context) {
        mSharePreferences = context.getApplicationContext().getSharedPreferences("cache", Context.MODE_PRIVATE);
        mEditor = mSharePreferences.edit();
    }

    public PreferenceUtils saveString(String key, String value) {
        mEditor.putString(key, value);
        return this;
    }

    public PreferenceUtils saveBoolean(String key, boolean value) {
        mEditor.putBoolean(key, value);
        return this;
    }

    public void commit() {
        mEditor.commit();
    }

    public String getString(String key,String defaultValue) {
        return mSharePreferences.getString(key, defaultValue);
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        return mSharePreferences.getBoolean(key, defaultValue);
    }

}
