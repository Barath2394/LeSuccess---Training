package com.Barath.Day3;
import java.util.*;
public class FindTheElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target Value : ");
        int target = sc.nextInt();
        if (linearSearch(arr,target)) {
            System.out.println(target + " is Present int the array");
        }
        else {
            System.out.println(target + " is not Present int the array");
        }
    }
    static boolean linearSearch(int[] nums,int target) {
        for (int num : nums) {
            if (num == target) return true;
        }
        return false;
    }
}
