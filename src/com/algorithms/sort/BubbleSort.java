package com.algorithms.sort;

import java.util.stream.IntStream;

//works by repeatedly swapping the adjacent elements if they are in the wrong order.
// O(N^2)
// O(1)
public class BubbleSort {
    //4,5,7,2,9,3
    //4,5,2,7,9,3
    //4,5,2,7,3,9
    //-----------
    //4,2,5,7,3,9
    //4,2,5,3,7,9
    //-----------
    //2,4,5,3,7,9
    //2,4,3,5,7,9
    //-----------
    //2,3,4,5,7,9
    public static void main(String[] args) {
        int[] arr = new int[] {4,5,7,2,9,3};
        for (int a: arr) {
            System.out.print(a + " ");
        }
        bubbleSort(arr);
        System.out.println();
        for (int a: arr) {
            System.out.print(a + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        IntStream.range(0,n-1)
                .flatMap(i -> IntStream.range(1, n-i))
                .forEach(j -> {
                    if(arr[j-1] >arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                    }
                });
    }
}
