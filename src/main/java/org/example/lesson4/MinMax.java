package org.example.lesson4;

import java.util.Arrays;

public class MinMax {

    private static int[][] data = new int[][]{{10, 20, 84},
                                             {68, 15, 18},
                                             {25, 58, 33}};


    public static void main(String[] args) {
        int[] arr = new int[]{13, 2, 1, 8, 23};
        var min = arr[0];
        var max = arr[0];
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(min);
        System.out.println(max);

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        avg = sum / arr.length;
        System.out.println(avg);

        System.out.println("_____________");


        System.out.println(Arrays.toString(MinMax.sum(data)));

        // записать в методы

    }

    public static int[] sum(int[][] arr) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < arr[0].length; i++) {
            sum1 = sum1 + arr[i][i];
            sum2 = sum2 + arr[i][arr[0].length - (i + 1)];
        }
        int[] a = new int[]{sum1, sum2};
        return a;


    }
}
