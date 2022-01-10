package com.jasleen.PracticeQuestions;
// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
public class RotateMatrix {
    public static void main(String[] args) {
        //int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        //int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
       // int[][] mat={{0,0,0},{0,0,1},{0,0,1}};
        //int[][] target={{0,0,0},{0,0,1},{0,0,1}};
       int[][] mat={{0,1},{1,0}};
       int[][] target={{1,0},{0,1}};
        System.out.println(findRotation(mat, target));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        int rotate = 0;
        //interchanging position of elements
        while (rotate <=3) {
            int test=1;
            for (int i = 0; i <mat.length; i++) {
                for (int j = i + 1; j < mat[i].length; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
            //setting rows and columns
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length / 2; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[i][mat[0].length - 1 - j];
                    mat[i][mat[0].length - 1 - j] = temp;
                }
            }
            //comparing mat and target matrix
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (mat[i][j] != target[i][j]) {
                        test =0;
                       break;
                    }
                }
                if (test == 0) break;
            }
            if(test==1)
                return true;
            rotate++;
        }
        return false;
    }
}
