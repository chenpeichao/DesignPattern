package org.pcchen.java.simple_factory;

/**
 * 加法运算
 *
 * @author ceek
 * @create 2019-09-18 11:37
 **/
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = getNumberA() + getNumberB();
        return result;
    }
}