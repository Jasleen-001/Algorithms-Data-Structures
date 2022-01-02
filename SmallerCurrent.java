package com.jasleen.PracticeQuestions;

import java.util.Arrays;

public class SmallerCurrent {
    public static void main(String[] args) {
        int[] nums={6,5,4,8};
        System.out.println(Arrays.toString(smallerCurr(nums)));
    }
    static int[] smallerCurr(int[] nums){
        int len = nums.length;
        int[] result = new int[len];
        for (int i = 0; i < len-1; i++) {
            for (int j = i+1; j < len; j++) {
                if (nums[i] > nums[j])
                    result[i]++;
                if(nums[i] < nums[j])
                    result[j]++;
            }
        }
        return result;
    }
}

