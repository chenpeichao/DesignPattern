package org.pcchen.java.simple_factory;

/**
 * 测试类
 *
 * @author ceek
 * @create 2019-09-18 16:29
 **/
public class Test {
    public static void main(String[] args) {
        Operation operate = OperationFactory.createOperate("+");
        operate.setNumberA(1);
        operate.setNumberB(2);
        System.out.println(operate.getResult());
    }
}
