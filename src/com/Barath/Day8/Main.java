package com.Barath.Day8;

public class Main {
    public static void main(String[] args) {
        int[] mountain = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;

        MountainArray mountainArr = new MountainArrayImpl(mountain);
        Solution solution = new Solution();

        int result = solution.findInMountainArray(target, mountainArr);
        System.out.println("Index of target " + target + ": " + result);
    }
}
