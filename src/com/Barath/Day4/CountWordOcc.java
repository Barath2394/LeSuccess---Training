package com.Barath.Day4;

import java.util.Scanner;

public class CountWordOcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.print("Enter the Target String : ");
        String target = sc.nextLine();
        int count = 0;
        for (int i = 0; i <= str.length() - target.length();i++) {
            if (str.charAt(i) == target.charAt(0)) {
                if (isPossible(str,i,target)) {
                    count++;
                }
            }
        }
        System.out.println("The Word " + target +" occurred : " + count + " times");
    }
    static boolean isPossible(String givenString,int ind,String targetString) {
        return givenString.substring(ind,ind+targetString.length()).equals(targetString);
    }
}
