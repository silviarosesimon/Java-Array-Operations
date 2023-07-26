package com.grokkingthecoding.warmup;

import java.util.HashSet;

//O(N), O(1)
public class Pangram {

    public static void main(String[] args) {
        System.out.println(isPangram("TheQuickBrownFoxJumpsOverTheLazyDog"));
    }

    public static boolean isPangram(String input) {
        HashSet<Character> characterHashSet = new HashSet<>();
        for (char c: input.toLowerCase().toCharArray()) {
            characterHashSet.add(c);
        }
        if(characterHashSet.size() == 26) {
            return true;
        }
        return false;
    }
}
