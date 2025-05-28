package com.Barath.Day5;

import java.util.Scanner;

public class PowOfX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter y : ");
        int y = sc.nextInt();
        System.out.println(findThePowOfX(x,y));
    }
    static long findThePowOfX(int x,int y) {
        if (y == 0) {
            return 1;
        }
        if (y % 2 == 0) {
            long res = findThePowOfX(x,y/2);
            return res * res;
        }
        else {
            return findThePowOfX(x,y-1) * x;
        }
    }
}
