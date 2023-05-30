package com.ds.array;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Arrays.stream(reverseArray(arr)).forEach(System.out::println);
        reverseBySwapItems(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void reverseBySwapItems(int[] arr) {
        for(int i=0; i<arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }

    public static int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }
}
