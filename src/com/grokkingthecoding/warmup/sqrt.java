package com.grokkingthecoding.warmup;

//O(logN)
public class sqrt {
    public static void main(String[] args) {
        int x = 16;
        System.out.println("sqrt of "+ x + " is: "+sqrt(x));
    }
    public static int sqrt(int x) {
        if(x < 2) {
            return x;
        }
        int left = 2;
        int right = x / 2;
        int pivot;
        long num;
        while(left <= right) {
            pivot = left + (right - left) / 2;
            num = (long) pivot * pivot;
            if(num >x) {
                right = pivot - 1;
            }
            else if(num < x) {
                left = pivot + 1;
            }
            else {
                return pivot;
            }
        }

        return right;
    }
}
