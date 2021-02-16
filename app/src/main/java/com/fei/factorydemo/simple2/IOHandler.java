package com.fei.factorydemo.simple2;

/**
 * @ClassName: IOHandler
 * @Description: java类作用描述
 * @Author: Fei
 * @CreateDate: 2021-02-16 14:52
 * @UpdateUser: 更新者
 * @UpdateDate: 2021-02-16 14:52
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface IOHandler {

    public void saveString(String key, String value);

    public void saveInt(String key, int value);

    public void saveBoolean(String key, boolean value);

    public void saveFloat(String key, float value);

    public void saveLong(String key, long value);

    public void saveObject(String key, Object value);

    public String getString(String key, String defValue);

    public int getInt(String key, int defValue);

    public boolean getBoolean(String key, boolean defValue);

    public float getFloat(String key, float defValue);

    public long getLong(String key, long defValue);

    public Object getObject(String key, Object defValue);

}
