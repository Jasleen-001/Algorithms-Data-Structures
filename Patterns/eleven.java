package com.jasleen.PatternsPQ;

public class eleven {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for(int i=0;i<2*n;i++) {
            int colsInRow=i>=n?i-n+1:n-i;
           for(int k=n;k>colsInRow;k--)
                System.out.print("  ");
            for(int j=0;j<colsInRow;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
