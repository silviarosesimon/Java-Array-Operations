package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NoPairsWithTargetDiff {
    public static void main(String[] args) {
        int k = 2;
        List<Integer> arr = new ArrayList<>();
        arr.addAll(List.of(1, 3, 5, 8, 6, 4, 2));
        System.out.println(noOfPairsWithTargetDiff(k, arr));
    }

    public static int noOfPairsWithTargetDiff(int k, List<Integer> arr) {
        int count = 0;
        Collections.sort(arr);
        int currentDiff;
        int currentLeft = 0;
        for(int currentRight = 1; currentRight < arr.size(); currentRight++) {
            currentDiff = Math.abs(arr.get(currentLeft) - arr.get(currentRight));
            if(currentDiff == k) {
                count++;
                currentLeft++;
            }
            if(currentDiff > k) {
                currentLeft++;
                currentRight--;
            }
        }
        return count;
    }
}
