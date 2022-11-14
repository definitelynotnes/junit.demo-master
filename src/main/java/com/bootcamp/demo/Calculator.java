package com.bootcamp.demo;

public class Calculator {
    public int computeSum(int x, int y) {
        return x + y;
    }

    public int computeSum(String x, String y) {
        try {
            int num1 = Integer.parseInt(x);
            int num2 = Integer.parseInt(y);
            return this.computeSum(num1, num2);
        } catch (NumberFormatException e) {
            throw e;
        }
    }
}
