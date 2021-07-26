package com.Alevel;

public class SortClass {
    public int[] array;

    public SortClass(int... array) {
        this.array = array;
    }

    public int[] insertionSort(int[] array, boolean isOrderedByASC) {
        int in, out;
        if (isOrderedByASC) {
            for (out = 1; out < array.length; out++) {
                int temp = array[out];
                in = out;
                while (in > 0 && array[in - 1] >= temp) {
                    array[in] = array[in - 1];
                    --in;
                }
                array[in] = temp;
            }
            return array;
        } else {
            for (out = 1; out < array.length; out++) {
                int temp = array[out];
                in = out;
                while (in > 0 && array[in - 1] < temp) {
                    array[in] = array[in - 1];
                    --in;
                }
                array[in] = temp;
            }
            return array;
        }
    }
}

