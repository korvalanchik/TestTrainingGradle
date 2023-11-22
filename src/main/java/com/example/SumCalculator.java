package com.example;

public class SumCalculator {
    public int sum(int n) {
        if(n<=0) {
            throw new IllegalArgumentException("Number can not be 0!");
        }
        int sumAll = 0;
        for (int i=1; i<=n; i++) {
            sumAll += i;
        }
        return sumAll;
    }
}
