package com.jasleen.PracticeQuestions;

import java.lang.*;
import java.util.Arrays;

public class ArrCopyMethod {
    public static void main(String[] args) {
        int nums[]={10,20,30};
        int ans[]=new int[2*nums.length];
        //PARAMETERS

                /*src − This is the source array.

                srcPos − This is the starting position in the source array.

                dest − This is the destination array.

                destPos − This is the starting position in the destination data.

                length − This is the number of array elements to be copied.  */

        System.arraycopy(nums,0,ans,0,nums.length);
        System.arraycopy(nums,0,ans,nums.length,nums.length);
        for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]+" ");
        System.out.println("\n"+Arrays.toString(ans));
    }
}
