package com.Barath.Day2;
import java.util.*;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the Rate : ");
        double rate = sc.nextDouble();

        System.out.print("Enter the Time : ");
        double time = sc.nextDouble();

        // Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Compound Interest
        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Compound Interest = " + compoundInterest);

        sc.close();
    }
}

