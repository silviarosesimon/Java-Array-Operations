package com.algorithms.sort;

// based on the Divide and Conquer algorithm that picks an element as a pivot
// and partitions the given array around the picked pivot by placing the pivot
// in its correct position in the sorted array.
public class QuickSort {

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
        quickSort(arr,0, arr.length-1);
        System.out.println();
        for (int a: arr) {
            System.out.print(a + " ");
        }
    }

    public static void quickSort(int[] arr, int begin, int end){
        if(begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    public static int partition(int[] arr, int begin, int end) {

        int pivot = arr[end];
        int i = begin - 1;

        for (int j = begin; j< end; j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return i+1;
    }
}
