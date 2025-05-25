package com.Barath.Day2;

import java.util.Scanner;

public class GradeBasedOnMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if (num >= 90 && num <= 100) {
            System.out.println("Grade A");
        }
        else if (num >= 75 && num <= 89) {
            System.out.println("Grade B");
        }
        else if (num >= 60 && num <= 74) {
            System.out.println("Grade C");
        }
        else if (num >= 40 && num <= 59) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Fail");
        }
    }
}
