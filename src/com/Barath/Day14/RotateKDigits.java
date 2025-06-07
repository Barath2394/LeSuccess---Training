package com.Barath.Day14;
import java.util.*;
public class RotateKDigits {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        rotateKDigits(q,3);
        for (int i : q) {
            System.out.print(i + " ");
        }
    }
    static void rotateKDigits(Queue<Integer> q,int k) {
        if (q == null || k <= 0) return;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(q.poll());
        }
        while (!stack.isEmpty()) {
            q.offer(stack.pop());
        }
        for (int i = 0; i < q.size() - k; i++) {
            q.offer(q.poll());
        }
     }
}
