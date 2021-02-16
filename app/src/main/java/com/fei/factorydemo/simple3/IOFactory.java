package com.fei.factorydemo.simple3;

/**
 * @ClassName: IOHandlerFactory
 * @Description: 工厂方法模式，一个工厂只生产一种类产品
 * @Author: Fei
 * @CreateDate: 2021-02-16 15:06
 * @UpdateUser: 更新者
 * @UpdateDate: 2021-02-16 15:06
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface IOFactory {

    public IOHandler createIOHandler();

}
