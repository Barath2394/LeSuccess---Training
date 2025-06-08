package com.Barath.Day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCombination {
    static String[] keyBoard = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the choice : ");
        List<String> ds = new ArrayList<>();
        String str = sc.nextLine();
        generateCombinations(str,0,new StringBuilder(),ds);
        System.out.println(ds);
    }
    static void generateCombinations(String str,int ind,StringBuilder current,List<String> ds) {
        if (ind == str.length()) {
            ds.add(current.toString());
            return;
        }
        String key = keyBoard[str.charAt(ind) - '0'];
        for (int i=0;i<key.length();i++) {
            current.append(key.charAt(i));
            generateCombinations(str,ind+1,current,ds);
            current.deleteCharAt(current.length()-1);
        }
    }
}
