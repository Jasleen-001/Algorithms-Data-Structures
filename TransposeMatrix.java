package com.jasleen.PracticeQuestions;
import java.sql.Statement;
import java.util.Arrays;
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][]matrix={{1,2,3},{4,5,6}};
        int[][] mat=Solution(matrix);

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++)
                System.out.print(mat[i][j]+ " " );
            System.out.println();
        }
    }
    public static int[][] Solution(int[][] matrix){
        int[][] mat=new int[matrix[0].length][matrix.length];
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                mat[j][i]=matrix[i][j];
            }
        }
        return mat;
    }
}
