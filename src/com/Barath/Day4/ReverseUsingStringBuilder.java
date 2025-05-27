package com.Barath.Day4;

import java.util.Scanner;

public class ReverseUsingStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.println(reverse(str));
    }
    static String reverse(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }
}
