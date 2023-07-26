package com.grokkingthecoding.twopointers;

import java.util.Arrays;

public class SquareSortedArray {
    public static void main(String[] args) {
        int[] arr = {-2, -1, 0, 2, 3};
        Arrays.stream(squareArrayWithoutSort(arr)).forEach(System.out::println);
        //Arrays.stream(squareArray(arr)).forEach(System.out::println);
    }

    //O(n*logn), O(n)
    public static int[] squareArray(int[] arr) {
        int[] squares = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            squares[i] = arr[i] * arr[i];
        }
        return Arrays.stream(squares).sorted().toArray();
    }

    //O(n), O(n)
    public static int[] squareArrayWithoutSort(int[] arr) {
        int[] squares = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        int highestSquareIdx = arr.length - 1;
        while(left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];
            if(leftSquare > rightSquare) {
                squares[highestSquareIdx--] = leftSquare;
                left++;
            }
            else {
                squares[highestSquareIdx--] = rightSquare;
                right--;
            }
        }
        return squares;
    }
}
