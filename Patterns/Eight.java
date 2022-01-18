package com.jasleen.PatternsPQ;

public class Eight {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for(int i=n;i>0;i--){
            //print spaces
            for(int k=0;k<n-i;k++)
                System.out.print("  ");
            for(int j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
