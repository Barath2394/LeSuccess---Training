package com.Barath.Day4;

import java.util.Scanner;

public class CapitalizeFirstCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.println(modifyString(str));
    }
    static String modifyString(String str) {
        char[] strArr = str.toCharArray();
        strArr[0] = (char)(strArr[0] - 32);
        for (int i = 1; i < strArr.length; i++) {
            if (strArr[i] == ' ') {
                strArr[i + 1] = (char)(strArr[i + 1] - 32);
            }
        }
        return new String(strArr);
    }
}
