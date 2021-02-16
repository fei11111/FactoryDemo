package com.fei.factorydemo.simple2;

/**
 * @ClassName: IOFactory
 * @Description: 简单工厂模式
 * @Author: Fei
 * @CreateDate: 2021-02-16 14:52
 * @UpdateUser: 更新者
 * @UpdateDate: 2021-02-16 14:52
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class IOFactory {

    public enum IOType {
        MEMORY, SP, DISK
    }

    public static IOHandler createIOHandler(IOType type){
        switch (type) {
            case SP:
                return new SPIOHandler();
            case DISK:
                return new DiskIOHandler();
            case MEMORY:
                return new MemoryIOHandler();
        }
        return null;
    }

}
