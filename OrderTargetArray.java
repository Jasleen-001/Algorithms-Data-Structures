package com.jasleen.PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class OrderTargetArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,0};
        int[] index={0,1,2,3,0};
        //int[] target={};
        //System.out.println(Arrays.toString(target));
       System.out.println(Arrays.toString(Solution(nums,index)));
    }
    static int[] Solution(int[] nums, int[] index){
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<index.length;i++)
            ans.add(index[i],nums[i]);
        int[] target=new int[ans.size()];
        for(int j=0;j<ans.size();j++)
            target[j]=ans.get(j);
        return target;
    }


}
