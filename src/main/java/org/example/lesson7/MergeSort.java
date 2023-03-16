package org.example.lesson7;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);
        }
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }


    static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int mediumIdx = array.length / 2;
        int[] leftHalf = Arrays.copyOfRange(array, 0, mediumIdx);
        int[] rightHalf = Arrays.copyOfRange(array, mediumIdx, array.length);

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        int[] mergedArray = combineArrays(leftHalf, rightHalf);
        for (int i=0; i<array.length; i++) {
            array[i] = mergedArray[i];
        }
//        System.out.println(Arrays.toString(array));
    }

    static int[] combineArrays(int[] left, int[] right) {
        int[] total = new int[left.length + right.length];
        int leftCounter = 0;
        int rightCounter = 0;

        for (int i=0; i<total.length; i++) {
            if (leftCounter < left.length && rightCounter < right.length) {
                if (left[leftCounter] < right[rightCounter]) {
                    total[i] = left[leftCounter];
                    leftCounter++;
                } else {
                    total[i] = right[rightCounter];
                    rightCounter++;
                }
            } else if (leftCounter == left.length) {
                total[i] = right[rightCounter];
                rightCounter++;
            } else if (rightCounter == right.length) {
                total[i] = left[leftCounter];
                leftCounter++;
            }

        }

        return total;
    }


}
