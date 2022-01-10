package com.jasleen.PracticeQuestions;
// https://leetcode.com/problems/maximum-population-year/
public class MaxPopulationYr {
    public static void main(String[] args) {
        int[][] logs={{1993,1999},{2000,2010}};
        System.out.println(Solution(logs));
    }
    public static int Solution(int[][] logs){
        int[] currentYr=new int[101];
        for(int i=0;i<logs.length;i++){
            currentYr[logs[i][0]-1950]++;
            currentYr[logs[i][1]-1950]--;
        }
        int currentPopulation=0;
        int maxPopulation=0;
        int maxPopulationYr=0;
        for(int i=0;i<currentYr.length;i++){
            currentPopulation+=currentYr[i];
            if(currentPopulation>maxPopulation){
                maxPopulationYr=i+1950;
                maxPopulation=currentPopulation;
            }
        }
        return maxPopulationYr;
    }
}
