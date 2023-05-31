package com.algorithms.sort;

public class MergeSort {
    //4,5,7,2,9,3
    //4,5,7 and 2,9,3
    //4 and 5,7
    //4 and 5 and 7
    //4 and  5,7
    //4,5,7 and 2,9,3
    //4,5,7 and 2 and 9,3
    //4,5,7 and 2 and 9 and 3
    //4,5,7 and 2 and 3,9
    //4,5,7 and 2,3,9
    //2,3,4,5,7,9
    public static void main(String[] args) {
        int[] arr = new int[] {4,5,7,2,9,3};
        for (int a: arr) {
            System.out.print(a + " ");
        }
        mergeSort(arr,arr.length);
        System.out.println();
        for (int a: arr) {
            System.out.print(a + " ");
        }
    }

    public static void mergeSort(int[] arr, int n) {
        if(n < 2) {
            return;
        }
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];

        for(int i=0; i<mid; i++) {
            left[i] = arr[i];
        }

        for(int i=mid; i<n; i++) {
            right[i-mid] = arr[i];
        }

        mergeSort(left,mid);
        mergeSort(right, n-mid);

        merge(arr,left,right,mid, n-mid);
    }

    public static void merge(int[] arr, int[] left, int[] right, int l, int r) {

        int i=0, j=0, k=0;

        while(i < l && j < r) {

            if(left[i] <= right[j]) {
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }

        while(i < l) {
            arr[k++] = left[i++];
        }

        while(j < r) {
            arr[k++] = right[j++];
        }
    }
}
