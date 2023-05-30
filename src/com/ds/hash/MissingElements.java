package com.ds.hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MissingElements {

    public static List<Integer> findMissingElements(int[] a, int[] b) {
        List<Integer> missingElements = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for(int x: b) {
            hashSet.add(x);
        }
        for(int y: a) {
            if(!hashSet.contains(y)) {
                missingElements.add(y);
            }
        }
        return missingElements;
    }

    public static void main(String[] args) {
        findMissingElements(new int[] {1,2,3,4} , new int[] {3,4}).forEach(System.out::println);
    }
}
