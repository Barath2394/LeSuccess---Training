package com.Barath.Day13;

import java.util.Arrays;
import java.util.Stack;

class StockSpanner {
    private Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        // Accumulate spans while price is greater than or equal to top
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        stack.push(new int[]{price, span});
        return span;
    }

    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int[] ans = new int[price.length];
        StockSpanner stockSpanner = new StockSpanner();
        for (int i = 0; i < price.length; i++) {
            ans[i] = stockSpanner.next(price[i]);
        }
        System.out.println(Arrays.toString(ans));
    }
}

