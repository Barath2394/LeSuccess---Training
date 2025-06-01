package com.Barath.Day9;

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();
        System.out.print("Enter n : ");
        long n = sc.nextLong();
        System.out.println(noOfOcc(str, n));
    }

    static long noOfOcc(String str, long n) {
        long count1 = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a') count1++;
        }

        long fullRepeat = n / str.length();
        long remainder = n % str.length();

        long count2 = 0;
        for (int i = 0; i < remainder; i++) {
            if (str.charAt(i) == 'a') count2++;
        }

        long tot = (fullRepeat * count1) + count2;
        return tot;
    }
}

