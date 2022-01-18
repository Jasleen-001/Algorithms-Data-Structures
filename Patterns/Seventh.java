package com.jasleen.PatternsPQ;

public class Seventh {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n) {
        for(int i=0;i<n;i++){
            //print spaces
            for(int k=0;k<n-i-1;k++)
                System.out.print("  ");
            for(int j=0;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}
