package com.Barath.Day5;

import java.util.Scanner;

public class OccurrenceOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.print("Enter the target character : ");
        char ch = sc.next().charAt(0);
        System.out.println("Count of " + ch + " is : " + fun(str,ch,0,0));
    }
    static int fun(String str,char target,int count,int i) {
        if (i == str.length()) {
            return count;
        }
        if (str.charAt(i) == target) {
            count++;
        }
        return fun(str,target,count,i+1);
    }
}
