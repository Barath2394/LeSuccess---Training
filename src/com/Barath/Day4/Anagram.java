package com.Barath.Day4;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String1 : ");
        String str1 = sc.nextLine();
        System.out.print("Enter the String2 : ");
        String str2 = sc.nextLine();
        if (isAnagram(str1,str2)) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not a Anagram");
        }
    }
    static boolean isAnagram(String str1,String str2) {
        int[] freq = new int[26];
        for (char c : str1.toCharArray()) {
            freq[c - 'a'] ++;
        }
        for (char c : str2.toCharArray()) {
            freq[c - 'a'] --;
        }
        for (int i : freq) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
