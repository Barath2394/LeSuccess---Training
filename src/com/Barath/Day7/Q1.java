package com.Barath.Day7;
class Calculator {
    int result = 0;
    static int operationCount = 0;
    public int add(int a,int b) {
        result = a + b;
        operationCount ++;
        return result;
    }
    public int sub(int a,int b) {
        result = Math.abs(a - b);
        operationCount ++;
        return result;
    }
    public int mul(int a,int b) {
        result = a * b;
        operationCount ++;
        return result;
    }
    public int div(int a,int b) {
        result = b / a;
        operationCount ++;
        return result;
    }
    public static int displayOperationCount() {
        return operationCount;
    }
}
public class Q1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(2,4);
        calculator.sub(2,4);
        calculator.mul(2,4);
        calculator.div(4,2);
        System.out.println(Calculator.displayOperationCount());
    }
}
