package com.grokkingthecoding.twopointers;

import java.util.Arrays;

//O(n), O(1)
public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;
        Arrays.stream(targetSumPair(arr, target)).forEach(System.out::println);
    }
    public static int[] targetSumPair(int[] arr, int target) {
        int[] pair = new int[] {-1,-1};
        int leftInd = 0;
        int rightInd = arr.length-1;
        while(leftInd < rightInd) {
            int left = arr[leftInd];
            int right = arr[rightInd];
            int sum = left+right;
            if(sum > target) {
                rightInd--;
            }
            else if(sum < target) {
                leftInd++;
            }
            else {
                pair[0] = leftInd;
                pair[1] = rightInd;
                break;
            }
        }
        return pair;
    }
}
