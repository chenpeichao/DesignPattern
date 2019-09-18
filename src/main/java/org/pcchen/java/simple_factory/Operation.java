package org.pcchen.java.simple_factory;

/**
 * 运算操作类
 *
 * @author ceek
 * @create 2019-09-18 11:19
 **/
public class Operation {
    private double numberA = 0;
    private double numberB = 0;

    public Operation() {
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public Operation(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public double getResult() {
        double result = 0;
        return result;
    }
}
