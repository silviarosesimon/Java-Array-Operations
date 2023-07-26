package com.grokkingthecoding.twopointers;

import java.util.Arrays;

// O(n*logn) + O(n^2) = O(n^2)
public class TripletSumCloseToTarget {

    public static void main(String[] args) {
        int[] arr = {-1, 0, 2, 3};
        int targetSum = 3;
        tripletSum(arr, targetSum);
    }
    public static int tripletSum(int[] arr, int targetSum) {
        int smallestDiff = Integer.MAX_VALUE;
        if(arr == null || arr.length < 3) {
            throw new IllegalArgumentException();
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length-2; i++) {
            int left=i+1, right=arr.length-1;
            while(left < right) {
                int targetDiff = targetSum - arr[i] - arr[left] -arr[right];
                if(targetDiff == 0) {
                    return targetSum;
                }
                if(Math.abs(targetDiff) < Math.abs(smallestDiff)
                    || (Math.abs(targetDiff) == Math.abs(smallestDiff) && targetDiff > smallestDiff)) {
                    smallestDiff = targetDiff;
                }
                if(targetDiff > 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return targetSum - smallestDiff;
    }
}
