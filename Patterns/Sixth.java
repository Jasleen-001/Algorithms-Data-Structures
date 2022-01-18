package com.jasleen.PatternsPQ;

public class Sixth {
    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            int totalColsRow = i > 5 ? 10 - i - 1 : i;
            for (int j = 0; j <= totalColsRow; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
