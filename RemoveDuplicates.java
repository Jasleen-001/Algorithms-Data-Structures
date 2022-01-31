package com.jasleen.ArraysPQ;
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums={1};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] arr){
        //optimized
        int index=1;
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i] != arr[i+1]) {
                arr[index++] = arr[i+1];
            }
        }
        return index;
    }
    //brute force
        /*int point=0;
        for(int i=0;i< nums.length;){
            nums[point]=nums[i];
            point++;
            int j=i+1;

            while(j< nums.length && nums[j]==nums[i]){
                j++;

            }

            i=j;
        }
        return point;
    }*/
}
