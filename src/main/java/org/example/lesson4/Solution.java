package org.example.lesson4;

import java.util.Arrays;

public class Solution {


    public static int[] getConcatenation(int[] nums) {

        int n = nums.length;

        int [] ans = new int[2*n];

        for (int i = 0; i < nums.length; i++){
            ans[i]= nums[i];
            ans[i+n] = nums[i];

        }
        return ans;
    }

    public static void main(String[] args) {


        System.out.println(Arrays.toString(Solution.getConcatenation(new int[]{1, 2, 1})));
    }
}


