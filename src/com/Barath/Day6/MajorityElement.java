package com.Barath.Day6;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMaj(arr));
    }
    private static int findMaj(int[] arr) {
        int maj = arr[0];
        int count = 1;
        for (int i=1;i<arr.length;i++){
            if(arr[i] == maj){
                count ++;
            }
            else {
                count --;
            }
            if(count == 0){
                maj = arr[i];
                count = 1;
            }
        }
        return maj;
    }
}
