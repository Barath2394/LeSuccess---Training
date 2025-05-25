package com.Barath.Day1;

import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number2 : ");
        int num2 = sc.nextInt();
        System.out.println("AND operation(&) : " + (num1 & num2));
        System.out.println("OR operation(|) : " + (num1 | num2));
        System.out.println("XOR operation(^) : " + (num1 ^ num2));
        System.out.println("Left Shift(<<) : " + (num1 << 2));
        System.out.println("Left Shift(<<) : " + (num2 << 2));
        System.out.println("Right Shift(>>) : " + (num1 >> 2));
        System.out.println("Right Shift(>>) : " + (num2 >> 2));
    }
}
