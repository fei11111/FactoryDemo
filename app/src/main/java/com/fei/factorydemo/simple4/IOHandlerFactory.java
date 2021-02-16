package com.fei.factorydemo.simple4;


import java.util.HashMap;

/**
 * @ClassName: IOFactory
 * @Description: 抽象工厂模式
 * @Author: Fei
 * @CreateDate: 2021-02-16 14:52
 * @UpdateUser: 更新者
 * @UpdateDate: 2021-02-16 14:52
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class IOHandlerFactory implements IOFactory {

    private static volatile IOHandlerFactory mInstance;
    private HashMap<String, IOHandler> mMap = new HashMap<>();

    private IOHandlerFactory() {

    }

    public static IOHandlerFactory getInstance() {
        if (mInstance == null) {
            synchronized (IOHandlerFactory.class) {
                if (mInstance == null) {
                    mInstance = new IOHandlerFactory();
                }
            }
        }
        return mInstance;
    }


    @Override
    public IOHandler createIOHandler(Class<? extends IOHandler> clazz) {
        IOHandler ioHandler = mMap.get(clazz.getName());
        if (ioHandler == null) {
            try {
                ioHandler = clazz.newInstance();
                if (ioHandler != null) {
                    mMap.put(clazz.getName(), ioHandler);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
        return ioHandler;
    }
}
