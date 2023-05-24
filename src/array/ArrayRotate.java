package array;

import java.util.Arrays;

public class ArrayRotate {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rotateArrayLeft(arr);
        Arrays.stream(arr).forEach(System.out::println);
        rotateArrayRight(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void rotateArrayLeft(int[] arr) {
        int first = arr[0];
        for(int i=0; i<arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;
    }

    public static void rotateArrayRight(int[] arr) {
        int last = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }
}
