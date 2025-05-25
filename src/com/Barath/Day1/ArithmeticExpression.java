package com.Barath.Day1;

import java.util.Scanner;

public class ArithmeticExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number2 : ");
        int num2 = sc.nextInt();
        // Accepting One Double Value
        System.out.print("Enter the Double Value : ");
        double doubleValue = sc.nextDouble();
        // Task 1: Performing all arithmetic operation(+,-,*,/)
        System.out.println("Addition of " + num1 + " and " + num2 + " : " + (num1 + num2));
        System.out.println("Subtraction of " + num1 + " and " + num2 + " : " + (num1 - num2));
        System.out.println("Multiplication of " + num1 + " and " + num2 + " : " + (num1 * num2));
        System.out.println("Division of " + num1 + " and " + num2 + " : " + (num1 / num2));
        // Task2: Mul the result of add with double value
        System.out.println("Multiplication of Addition with doubleValue = " + doubleValue * (double)(num1 + num2));
    }
}
