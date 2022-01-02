package com.jasleen.PracticeQuestions;
//https://leetcode.com/problems/shuffle-the-array/
// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].
import java.util.Arrays;

public class ShuffleArr {
    public static void main(String[] args) {
        int[] nums={2,5,1,4,3,7};
        int n=3;
        int[] arr=new int[2*n];
        int p1=0,p2=n;
        for(int i=0;i<2*n;i++) {
            //while (p1 < n || p2 < nums.length) {
                if (i % 2 == 0) {
                    arr[i] = nums[p1];
                    p1++;
                    //break;
                } else {
                    arr[i] = nums[p2];
                    p2++;
                   // break;
                }
            //}
        }
            System.out.println(Arrays.toString(arr));

    }
}
