package org.example.lesson7;

import java.util.Arrays;

public class InsertionSort {
    private static int[] data = {9, 7, 6, 15, 17, 5, 10, 11};
    private static int[] expected = {5, 6, 7, 9, 10, 11, 15, 17};

    static void sort(int[] data){
        for (var j = 1; j < data.length; j++) {
            var key = data[j];
            var i = j - 1;
            for (; i >= 0 && data[i] > key; i--) {
                data[i + 1] = data[i];
            }
            data[i + 1] = key;
        }

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(data));
        InsertionSort.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
