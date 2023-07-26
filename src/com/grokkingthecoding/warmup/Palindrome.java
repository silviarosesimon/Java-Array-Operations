package com.grokkingthecoding.warmup;

import java.util.stream.IntStream;

public class Palindrome {

    public static void main(String[] args) {
        String input = args[0];
        String normalized = input.toLowerCase();
        printOutput(input, stringBuilderReverse(normalized));
        printOutput(input, stringBuilderAppend(normalized));
        printOutput(input, withoutNewString(normalized));
        printOutput(input, withoutNewStringJava8(normalized));
    }

    public static void printOutput(String input, boolean isPalindrome) {
        if(isPalindrome) {
            System.out.println(input + " is a palindrome");
        }
        else {
            System.out.println(input + " is not a palindrome");
        }
    }

    private static boolean stringBuilderReverse(String normalized) {
        StringBuilder reverseString = new StringBuilder(normalized).reverse();
        return normalized.equals(reverseString.toString());
    }

    private static boolean stringBuilderAppend(String normalized) {
        StringBuilder reverseString = new StringBuilder();
        for (int i=normalized.length()-1; i>=0; i--) {
            reverseString.append(normalized.charAt(i));
        }
        return normalized.equals(reverseString.toString());
    }

    private static boolean withoutNewString(String normalized) {
        boolean isPalindrome = false;
        for (int i=0; i<normalized.length()/2; i++) {
            if(normalized.charAt(i) == normalized.charAt(normalized.length()-i-1)) {
                isPalindrome = true;
            }
            else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    private static boolean withoutNewStringJava8(String normalized) {
        return IntStream.range(0,normalized.length()/2)
                .allMatch(i->
                        normalized.charAt(i) == normalized.charAt(normalized.length()-i-1));
    }

}