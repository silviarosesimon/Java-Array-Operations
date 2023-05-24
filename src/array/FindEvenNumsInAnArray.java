package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class FindEvenNumsInAnArray {
    public static void main(String[] args) {
        int[] arr1 = {-9,3,2,-8,12,16};
        int[] arr2 = {0,-3,-8,-35,40,20,7};
        Arrays.stream(findEvenNums(arr1, arr2)).forEach(System.out::println);
        Arrays.stream(streamWayFindEvenNums(arr1, arr2)).forEach(System.out::println);
    }

    public static int[] streamWayFindEvenNums(int[] arr1, int[] arr2) {
        return Stream.of(arr1,arr2).flatMapToInt(Arrays::stream).filter(num -> num%2 ==0).toArray();
    }

    private static boolean isEven(int num) {
        if(num%2 == 0) {
            return true;
        }
        return false;
    }

    public static int[] findEvenNums(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int num: arr1) {
            if(isEven(num)) {
                result.add(num);
            }
        }
        for(int num: arr2) {
            if(isEven(num)) {
                result.add(num);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
