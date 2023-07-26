package com.grokkingthecoding.warmup;

//O(n), O(1)
public class ReverseVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello world"));
    }
    public static String reverseVowels(String s) {
        String vowels = "aeiouy";
        char[] charArray = s.toLowerCase().toCharArray();

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (vowels.indexOf(charArray[i]) == -1) {
                i++;
                continue;
            }
            if (vowels.indexOf(charArray[j]) == -1) {
                j--;
                continue;
            }

            char t = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = t;

            i++;
            j--;

        }
        String str = String.copyValueOf(charArray);
        return str;
    }
}
