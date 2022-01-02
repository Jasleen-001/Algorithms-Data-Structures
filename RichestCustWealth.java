package com.jasleen.PracticeQuestions;

//Q: https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustWealth {
    public static void main(String[] args) {
        int[][] accounts={{1,5},{7,3},{3,5}};
        int max=0;
        //int sum=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++) {
              //  int sum=0;
                sum += accounts[i][j];
            }
            if(sum>max) max=sum;
        }

        System.out.println(max);
    }
}
