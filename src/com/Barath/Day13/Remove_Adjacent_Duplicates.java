package com.Barath.Day13;

import java.util.Stack;

public class Remove_Adjacent_Duplicates {
    public static void main(String[] args) {
        System.out.println(fun("abbaca"));
    }
    static String fun(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            }
            else {
                stack.push(c);
            }
        }
        String ans = "";
        for (char ch : stack) {
            ans = ans + ch;
        }
        return ans;
    }
}
