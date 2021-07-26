package com.Alevel;

import java.util.Arrays;

public class StringArray {
    public int[] myArr;
    public StringArray(int... myArr){
        this.myArr = myArr;
    }

    public void printArray(int[]k){
        System.out.println(Arrays.toString(k));
    }
}