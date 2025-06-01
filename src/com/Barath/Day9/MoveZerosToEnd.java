package com.Barath.Day9;

import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Moving zeros to end");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        moveZeros(arr);
        System.out.println("After Moving zeros to end");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void moveZeros(int[] arr) {
        int nz = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr,i,nz);
                nz++;
            }
        }
    }
    static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
