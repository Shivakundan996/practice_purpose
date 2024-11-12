package com.cgi.learning;

import java.util.Arrays;

public class Calc {

    public int divide(int a,int b) {
        return a / b;
    }

    public int[] sortedArray(int[] a){
        Arrays.sort(a);
        return a;
    }

    public int[] sortedArrayPerformance(int[] a){
        for (int i = 0; i < 1000; i++) {
            Arrays.sort(a);
        }

        return a;
    }
}
