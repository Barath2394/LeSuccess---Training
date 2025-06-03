package com.Barath.Day2;
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Calculate Simple Interest");
        System.out.println("2. Calculate Compound Interest");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        System.out.print("Enter the Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the Rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter the Time (years): ");
        double time = sc.nextDouble();

        switch (choice) {
            case 1:
                // Simple Interest
                double simpleInterest = (principal * rate * time) / 100;
                System.out.println("Simple Interest = " + simpleInterest);
                break;

            case 2:
                // Compound Interest
                double amount = principal * Math.pow((1 + rate / 100), time);
                double compoundInterest = amount - principal;
                System.out.println("Compound Interest = " + compoundInterest);
                break;

            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
                break;
        }

        sc.close();
    }
}


