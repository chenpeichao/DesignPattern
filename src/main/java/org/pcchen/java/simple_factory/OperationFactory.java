package org.pcchen.java.simple_factory;

/**
 * 简单工厂类
 *
 * @author ceek
 * @create 2019-09-18 11:42
 **/
public class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation operation = null;
        if("+".equals(operate)) {
            operation = new OperationAdd();
        } else {
            operation = new OperationSub();
        }
        return operation;
    }
}
