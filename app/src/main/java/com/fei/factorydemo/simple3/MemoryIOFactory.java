package com.fei.factorydemo.simple3;

/**
 * @ClassName: MemoryIOFactory
 * @Description: java类作用描述
 * @Author: Fei
 * @CreateDate: 2021-02-16 15:07
 * @UpdateUser: 更新者
 * @UpdateDate: 2021-02-16 15:07
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MemoryIOFactory implements IOFactory {
    @Override
    public IOHandler createIOHandler() {
        return new MemoryIOHandler();
    }
}
