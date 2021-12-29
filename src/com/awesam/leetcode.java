package com.awesam;

import java.util.Arrays;

public class leetcode {
        static int removeDuplicates(int[] nums) {
            int j= 1;
                for (int i = 0; i < nums.length-1; i++) {
                    if (nums[i] != nums[i+1]) {
                        nums[j++]=nums[i+1];
                    }
                }
                return j;
            }


    public static void main(String[] args) {
        int[]num={1,1,7};
        System.out.println(removeDuplicates(num));
        System.out.println(Arrays.toString(num));
    }
}
