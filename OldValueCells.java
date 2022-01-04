package com.jasleen.PracticeQuestions;
//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
public class OldValueCells {
    public static void main(String[] args) {
        int[][] indices={{0,1},{1,1}};
        int m=2,n=3;
        System.out.println(Solution(m,n,indices));
    }
    public static int Solution(int m,int n,int[][] indices){
        int[][] arr=new int[m][n];
        int countOdd=0;
        for(int i=0;i<indices.length;i++){
                int value=indices[i][0];
                int k=0,l=0;
                while(k<n ){ //row update
                    arr[value][k]+=1;
                    k++;
                }
                value=indices[i][1];
               while(l<m){  //column update
                    arr[l][value]++;
                    l++;
                }
            }

        for(int i[]:arr){
            for(int j:i)
                if(j%2!=0) countOdd++;
        }
        return countOdd;
    }
}
