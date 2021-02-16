package com.fei.factorydemo.simple3;

/**
 * @ClassName: DiskIOHandler
 * @Description: java类作用描述
 * @Author: Fei
 * @CreateDate: 2021-02-16 14:57
 * @UpdateUser: 更新者
 * @UpdateDate: 2021-02-16 14:57
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class DiskIOHandler implements IOHandler {
    @Override
    public void saveString(String key, String value) {

    }

    @Override
    public void saveInt(String key, int value) {

    }

    @Override
    public void saveBoolean(String key, boolean value) {

    }

    @Override
    public void saveFloat(String key, float value) {

    }

    @Override
    public void saveLong(String key, long value) {

    }

    @Override
    public void saveObject(String key, Object value) {

    }

    @Override
    public String getString(String key, String defValue) {
        return null;
    }

    @Override
    public int getInt(String key, int defValue) {
        return 0;
    }

    @Override
    public boolean getBoolean(String key, boolean defValue) {
        return false;
    }

    @Override
    public float getFloat(String key, float defValue) {
        return 0;
    }

    @Override
    public long getLong(String key, long defValue) {
        return 0;
    }

    @Override
    public Object getObject(String key, Object defValue) {
        return null;
    }
}
