package com.grokkingthecoding.twopointers;

//O(n), O(1)
public class RemoveAllTarget {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 6, 3, 10, 9, 3};
        int target = 3;
        System.out.println(removeAllInstance(arr,target));
    }

    public static int removeAllInstance(int[] arr, int target) {
        int nextElement = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != target) {
                arr[nextElement] = arr[i];
                nextElement++;
            }
        }
        return nextElement;
    }
}
