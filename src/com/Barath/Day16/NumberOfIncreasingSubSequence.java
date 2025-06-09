package com.Barath.Day16;

import java.util.Arrays;

class NumberOfIncreasingSubSequence {
    public static int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] length = new int[n];  // Length of LIS ending at i
        int[] count = new int[n];   // Count of LIS ending at i

        Arrays.fill(length, 1); // Every element is an LIS of length 1
        Arrays.fill(count, 1);  // Every element has 1 LIS by itself

        int maxLen = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (length[j] + 1 > length[i]) {
                        length[i] = length[j] + 1;
                        count[i] = count[j]; // Reset count
                    } else if (length[j] + 1 == length[i]) {
                        count[i] += count[j]; // Add more paths
                    }
                }
            }
            maxLen = Math.max(maxLen, length[i]);
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            if (length[i] == maxLen) {
                total += count[i];
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7};
        System.out.println(findNumberOfLIS(nums));
    }
}

