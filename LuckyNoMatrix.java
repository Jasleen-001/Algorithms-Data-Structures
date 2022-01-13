package com.jasleen.PracticeQuestions;
//https://leetcode.com/problems/lucky-numbers-in-a-matrix/
import java.util.ArrayList;
import java.util.List;

public class LuckyNoMatrix {
    public static void main(String[] args) {
        int[][] matrix={{7,8},{1,2}};
        System.out.println(Solution(matrix));
    }
    public static List Solution(int[][] matrix){
        List<Integer> res=new ArrayList<>();
        int k=0;
        for(int i=0;i<matrix.length;i++){
            int min=matrix[i][0];
            for(int j=1;j<matrix[i].length;j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    k=j;
                }
            }
                if(CheckMax(matrix,i,k,min))
                    res.add(min);
            
        }
        return res;
    }

    public static boolean CheckMax(int[][] matrix,int row,int col,int ele){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][col]>ele )
                return false;
        }
        return true;
    }

}
