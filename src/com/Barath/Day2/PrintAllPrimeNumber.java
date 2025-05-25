package com.Barath.Day2;

import java.util.Scanner;

public class PrintAllPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int num) {
        int count = 0;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count == 0;
    }
}
