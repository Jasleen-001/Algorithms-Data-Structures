package com.jasleen.PracticeQuestions;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayFromInt {
    public static void main(String[] args) {
        int[] arr={9,9,9,9,9,9,9,9,9};
        List<Integer> Inum=Solution(arr,1);
        System.out.println(Inum);
    }
    public static List<Integer> Solution(int[] nums,int k) {
        int length = nums.length - 1;
        int sum=k;
        List<Integer> inum=new ArrayList<>();
        for(int i=length;i>=0;i--){
            sum+=nums[i];
            inum.add(sum%10);
            sum/=10;
        }
        while(sum!=0){
            inum.add(sum%10);
            sum/=10;
        }

        Collections.reverse(inum);
        return inum;
    }

}
