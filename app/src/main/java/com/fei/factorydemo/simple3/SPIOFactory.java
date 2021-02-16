package com.fei.factorydemo.simple3;

/**
 * @ClassName: SPIOFactory
 * @Description: java类作用描述
 * @Author: Fei
 * @CreateDate: 2021-02-16 15:08
 * @UpdateUser: 更新者
 * @UpdateDate: 2021-02-16 15:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class SPIOFactory implements IOFactory {
    @Override
    public IOHandler createIOHandler() {
        return new SPIOHandler();
    }
}
