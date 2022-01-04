package com.jasleen.PracticeQuestions;
// https://leetcode.com/problems/matrix-diagonal-sum/
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat={{5}};
        System.out.println(Solution(mat));
    }
    public static int Solution(int[][] mat){
        int sum=0,beg=0;
        int size=mat.length;
        int end=mat.length-1;
        while(beg<end){
            sum+=mat[beg][beg];
            sum+=mat[end][end];
            sum+=mat[end][beg];
            sum+=mat[beg][end];
            beg++;
            end--;
        }
        if(size%2!=0)
            sum+=mat[size/2][size/2];
        return sum;
    }
}
