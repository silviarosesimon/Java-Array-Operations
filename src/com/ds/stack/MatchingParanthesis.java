package com.ds.stack;

import java.util.Stack;

public class MatchingParanthesis {

    public static boolean hasMatchingParanthesisUsingFlag(String s) {
        int matchingParanthesis = 0;
        for(int i=0; i<s.length(); i++) {
            char current = s.charAt(i);
            if(current == '(') {
                matchingParanthesis++;
            }
            else if(current == ')') {
                if(matchingParanthesis > 0) {
                    matchingParanthesis--;
                }
                else {
                    return false;
                }
            }
        }
        return matchingParanthesis == 0;
    }

    public static boolean hasMatchingParanthesis(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char current = s.charAt(i);
            if(current == '(') {
               stack.push(current);
            }
            else if(current == ')') {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(hasMatchingParanthesis("((algorithm))"));
        System.out.println();
        System.out.println(hasMatchingParanthesis("((algorithm)"));
        System.out.println();
        System.out.println(hasMatchingParanthesisUsingFlag("((algorithm))"));
        System.out.println();
        System.out.println(hasMatchingParanthesisUsingFlag("((algorithm)"));
    }
}
