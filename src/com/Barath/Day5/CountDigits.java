package com.Barath.Day5;

import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Number of digits : " + fun(num,0));
    }
    static int fun(int n,int count) {
        if (n == 0) {
            return count;
        }
        return fun(n/10,count+1);
    }
}
