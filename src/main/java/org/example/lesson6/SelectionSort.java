package org.example.lesson6;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            int swap = array[i];
            array[i] = array[min];
            array[min] = swap;
        }
        System.out.println(Arrays.toString(array));
    }
}
