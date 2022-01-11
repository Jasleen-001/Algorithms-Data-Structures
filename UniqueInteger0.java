package com.jasleen.PracticeQuestions;

import java.util.Arrays;

public class UniqueInteger0 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution(1)));
    }

    public static int[] Solution(int n){
        int[] arr=new int[n];
        int a=-n/2;
        if(n%2!=0){
            for(int i=0;i<n;i++){
                arr[i]=a;
                a++;
            }
        }
        else{
            for(int i=0;i<n;i++){
                arr[i]=a;
                a++;
                if(a==0)
                    a++;
            }
        }
        return arr;
    }
}
