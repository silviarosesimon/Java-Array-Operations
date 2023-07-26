package com.grokkingthecoding.twopointers;

//O(n), O(1)
public class RemoveDuplicatesWithSpaceComplexityOne {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 3, 6, 9, 9};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] arr) {
        int newLength = arr.length;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
                newLength--;
            }
        }
        return newLength;
    }
}
