package com.Barath.Day4;

import java.util.Scanner;

public class CheckVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                vowelCount++;
            }
            else {
                consonantCount++;
            }
        }
        System.out.println("Vowel count : " + vowelCount);
        System.out.println("Consonant count : " + consonantCount);
    }
    static boolean isVowel(char c) {
        return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') ||(c == 'u');
    }
}
