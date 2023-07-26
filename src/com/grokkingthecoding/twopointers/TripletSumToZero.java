package com.grokkingthecoding.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// O(n*logn) + O(n^2) = O(n^2)
// O(n) for sorting + output array size
public class TripletSumToZero {

    public static void main(String[] args) {
        int[] arr = {-3, 0, 1, 2, -1, 1, -2};
        System.out.println(Arrays.deepToString(searchTriplets(arr).toArray()));
    }

    //O(n*logn) + O(n)
    public static List<List<Integer>> searchTriplets(int[] arr) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(arr);
        int prevElement = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-2; i++) {
            if(prevElement != arr[i]) {
               searchPairs(arr[i], arr,i+1,triplets);
            }
            prevElement = arr[i];
        }
        return triplets;
    }

    //O(n)
    private static void searchPairs(int x, int[] arr,int leftInd,List<List<Integer>> triplets ) {
        int sum = -x;
        int rightInd = arr.length - 1;
        int leftPrevElement = Integer.MAX_VALUE;
        int rightPrevElement = Integer.MAX_VALUE;

        while(leftInd < rightInd) {
            if(arr[leftInd] + arr[rightInd] > sum) {
                rightInd--;
            }
            else if(arr[leftInd] + arr[rightInd] < sum) {
                leftInd++;
            }
            else {
                triplets.add(Arrays.asList(x,arr[leftInd],arr[rightInd]));
                leftInd++;
                rightInd--;
                while(leftInd < rightInd && arr[leftInd] == leftPrevElement) {
                    leftInd++;
                }
                while(leftInd < rightInd  && arr[rightInd] == rightPrevElement) {
                    rightInd--;
                }

            }
            leftPrevElement = arr[leftInd];
            rightPrevElement = arr[rightInd];
        }
    }
}
