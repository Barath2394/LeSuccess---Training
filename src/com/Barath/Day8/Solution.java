package com.Barath.Day8;

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();

        // Step 1: Find the peak index
        int peak = findPeakIndex(mountainArr, 0, n - 1);

        // Step 2: Search in the increasing part
        int index = binarySearch(mountainArr, target, 0, peak, true);
        if (index != -1) return index;

        // Step 3: Search in the decreasing part
        return binarySearch(mountainArr, target, peak + 1, n - 1, false);
    }

    private int findPeakIndex(MountainArray arr, int low, int high) {
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    private int binarySearch(MountainArray arr, int target, int low, int high, boolean ascending) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int value = arr.get(mid);

            if (value == target) return mid;

            if (ascending) {
                if (value < target) low = mid + 1;
                else high = mid - 1;
            } else {
                if (value > target) low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
    }
}

