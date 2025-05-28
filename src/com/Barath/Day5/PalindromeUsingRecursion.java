package com.Barath.Day5;

import java.util.*;

public class PalindromeUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();
        boolean ans = isPalindrome(str,0,str.length()-1);
        System.out.println(ans);
    }
    static boolean isPalindrome(String str,int left,int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindrome(str,left+1,right-1);
    }
}
