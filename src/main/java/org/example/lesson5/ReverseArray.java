package org.example.lesson5;

import java.util.Arrays;
import java.util.Random;

public class ReverseArray {

    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));

    }

    static void reverse(int[] array){
       int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[array.length-1-i]=array[i];
            }
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }
    }
}
