package com.ds.array;

import java.util.Arrays;

public class Maxproduct {

    public static void main(String args[]) {
        int[] arr = {-2,-1,-3,4,-8,0};
        int length = arr.length;
        int max = Integer.MIN_VALUE;
       /* for(int i=0; i<length; i++) {
            for(int j=i+1; j<length; j++){
                if(arr[i]*arr[j] > max) {
                    max = arr[i]*arr[j];
                }
            }
        }*/
        Arrays.sort(arr);
        max = arr[length-1] * arr[length -2];
        int min = arr[0] * arr[1];
        if (min > max) {
            max = min;
        }
        System.out.println(max);
        //return pair of indices
        //min product
        //replace items that create the max product
    }
}
