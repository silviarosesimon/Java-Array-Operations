package com.ds.array;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArraySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(binarySearch(arr,5));
        System.out.println(Arrays.binarySearch(arr,4));
        System.out.println(linearSearch(arr,4));
        System.out.println(linearSearch(arr,9));
        streamSearch(arr,3).ifPresent(System.out::println);
        streamSearch(arr,9).ifPresent(System.out::println);
    }

    public static Integer binarySearch(int[] arr, int item) {
        int min = 0;
        int max = arr.length - 1;
        while(min <= max) {
            int mid = (min + max) / 2;
            if(item == arr[mid]) {
                return mid;
            }
            else if(item < arr[mid]) {
                max = mid - 1;
            }
            else {
                min = mid + 1;
            }
        }
        return null;
    }

    public static Integer linearSearch(int[] arr, int item) {
        for(int a: arr) {
            if(a==item) {
                return item;
            }
        }
        return null;
    }

    public static OptionalInt streamSearch(int[] arr, int item) {
        return Arrays.stream(arr).filter(x -> x==item).findFirst();
    }

}
