package com.Barath.Day3;

import java.util.Scanner;

public class RotateKTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K Value :");
        int k = sc.nextInt();
        rotate(arr,k);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void rotate(int[] nums,int k) {
        int n = nums.length;
        if (k < 0) {
            k += n;
        }
        k %= n;
        rev(nums,0,k-1);
        rev(nums,k,n-1);
        rev(nums,0,n-1);
    }
    static void rev(int[] nums,int start,int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
