package com.grokkingthecoding.warmup;

import java.util.Arrays;

//O(n*logn) for sorting, O(1)
public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
    }
    public static boolean isAnagram(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1 != n2) {
            return false;
        }
        char[] char1 = s1.toLowerCase().toCharArray();
        char[] char2 = s2.toLowerCase().toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        for(int i=0; i<n1; i++) {
            if(char1[i] != char2[i]) {
                return false;
            }
        }
        return true;
    }
}
