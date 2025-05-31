package com.Barath.Day6;

import java.util.Scanner;

public class KadaneAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMaxSum(arr));
    }
    static int findMaxSum(int[] arr) {
        int sum = 0,max = 0;
        for (int i=0;i< arr.length;i++) {
            if (sum >=0) {
                sum += arr[i];
            }
            else {
                sum = arr[i];
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}
