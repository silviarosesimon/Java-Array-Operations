package com.ds.stack;

import java.util.Stack;

import static java.lang.Character.isDigit;

public class EvaluatePostfixExpression {

    public static int evaluatePostFix(String expression) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<expression.length();i++) {
            char c = expression.charAt(i);
            if(isDigit(c)) {
                stack.push(c - '0');
            }
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluatePostFix("231*+9-"));
    }
}
