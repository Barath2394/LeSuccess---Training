package com.Barath.Day3;
import java.util.*;
public class FindDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        printDuplicates(arr);
    }
    static void printDuplicates(int[] nums) {
        Map<Integer,Integer> mpp = new HashMap<>();
        for (int num : nums) {
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }
        System.out.println("Duplicates are : ");
        for (int key : mpp.keySet()) {
            if (mpp.get(key) > 1) {
                System.out.print(key + " ");
            }
        }
    }
}
