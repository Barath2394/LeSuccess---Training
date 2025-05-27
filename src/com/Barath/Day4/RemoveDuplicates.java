package com.Barath.Day4;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.println(removeChars(str));
    }
    static String removeChars(String str) {
        Map<Character,Integer> mpp = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        for (char c : str.toCharArray()) {
            mpp.put(c,mpp.getOrDefault(c,0)+1);
            if (mpp.get(c) > 1) continue;
            ans.append(c);
        }
        return ans.toString();
    }
}
