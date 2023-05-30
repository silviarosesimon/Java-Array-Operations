package com.ds.hash;

import java.util.HashMap;

public class CountOfElements {

    public static void displayFrequencyOfEachElement(int[] a) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int x: a) {
            if(!hashMap.containsKey(x)) {
                hashMap.put(x,1);
            }
            else {
                hashMap.put(x,hashMap.get(x) + 1);
            }
        }
        hashMap.forEach((key,value) -> System.out.println(key + "-->" +value));
    }

    public static void main(String[] args) {
        displayFrequencyOfEachElement(new int[] {1,2,3,2,2,4,1});
    }
}
