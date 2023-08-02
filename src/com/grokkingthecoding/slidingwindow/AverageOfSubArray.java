package com.grokkingthecoding.slidingwindow;

import java.util.Arrays;

//Given an array, find the average of each subarray of ‘K’ contiguous elements in it.
public class AverageOfSubArray {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        Arrays.stream(findAverages(arr, k)).forEach(System.out::println);
    }

    public static double[] findAverages(int[] arr, int k) {
        double[] averages = new double[arr.length - k + 1];
        double windowSum = 0;
        int windowStart = 0;
        for(int i=0; i<arr.length; i++) {
            windowSum += arr[i];
            if(i >= k-1) {
                averages[windowStart] = windowSum / k;
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return averages;
    }
}
