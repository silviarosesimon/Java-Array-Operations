package com.grokkingthecoding.slidingwindow;

//Given an array of positive numbers and a positive number 'k,'
//find the maximum sum of any contiguous subarray of size 'k'.
//Brute Force - O(n*k)
//O(N), O(1)
public class MaxSum {

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 1, 5, 1, 3, 2 };
        int k = 3;
        System.out.println(maxSum(arr,k));
    }

    public static int maxSum(int[] arr, int k) {
        int maxSum = 0;
        int windowSum = 0;
        int windowStart = 0;
        for(int i=0; i<arr.length; i++) {
            windowSum += arr[i];
            if(i >= k-1) {
                maxSum = Math.max(maxSum,windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
}
