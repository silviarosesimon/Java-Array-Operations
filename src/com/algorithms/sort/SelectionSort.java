package com.algorithms.sort;

public class SelectionSort {

    //4,5,7,2,9,3
    //2,5,7,4,9,3
    //2,3,7,4,9,5
    //2,3,4,7,9,5
    //2,3,4,5,9,7
    //2,3,4,5,7,9
    public static void main(String[] args) {
        int[] arr = new int[] {4,5,7,2,9,3};
        for (int a: arr) {
            System.out.print(a + " ");
        }
        selectionSort(arr);
        System.out.println();
        for (int a: arr) {
            System.out.print(a + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j=i+1; j<arr.length; j++) {
                if(arr[minElementIndex] > arr[j]) {
                    minElementIndex = j;
                }
            }

            if(minElementIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minElementIndex];
                arr[minElementIndex] = temp;
            }
        }
    }
}
