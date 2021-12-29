package com.awesam;

public class Solution {

    static int solution(int[] S) {
        int max_sum = 0;
        int current_sum = 0;
        boolean positive = false;
        int n = S.length;
        if (n<2)return 1;
        for (int i = 0; i < n; ++i) {
            int item = S[i];
            if (item < 0) {
                if (max_sum < current_sum) {
                    max_sum = current_sum;
                    current_sum = 0;
                }
            } else {
                positive = true;
                current_sum += item;
            }
        }
        if (current_sum > max_sum) {
            max_sum = current_sum;
        }
        if (positive) {
            return max_sum;
        }

        return -1;
    }
    public static void main(String[]ars){
    int [] s={-1,-2};
        System.out.println(solution(s));
    }
}
