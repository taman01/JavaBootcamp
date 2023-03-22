package org.example.lesson5;

import java.util.Arrays;
import java.util.Random;

public class GoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++)
            if (nums[i] == nums[j] && i < j) {
                temp++;
            }

        }
        return temp;
    }

    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(GoodPairs.numIdenticalPairs(array));
    }
}
