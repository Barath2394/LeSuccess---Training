package com.Barath.Day4;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.println(modifyTheString(str));
    }
    static String modifyTheString(String str) {
        char[] strArr = str.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] >= 'a' && strArr[i] <= 'z') {
                strArr[i] = (char)(strArr[i] - 32);
            }
            else {
                strArr[i] = (char)(strArr[i] + 32);
            }
        }
        return new String(strArr);
    }
}
