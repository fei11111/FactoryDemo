package com.fei.factorydemo.simple4;

/**
 * @ClassName: IOHandlerFactory
 * @Description: 抽象工厂模式
 * @Author: Fei
 * @CreateDate: 2021-02-16 15:06
 * @UpdateUser: 更新者
 * @UpdateDate: 2021-02-16 15:06
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface IOFactory {

    public IOHandler createIOHandler(Class<? extends IOHandler> clazz);

}
