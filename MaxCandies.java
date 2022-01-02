package com.jasleen.PracticeQuestions;//Q: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
import java.util.*;
public class MaxCandies {
    public static void main(String[] args) {
        int[] candies={2,3,5,1,4};
        int extraCandies=3;
        System.out.println(kidsWithCandies(candies,extraCandies));

    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        List<Boolean> ans=new ArrayList<>();
        for (int candy : candies) if (candy > max) max = candy;
        for(int j:candies){
            if (j + extraCandies < max) {
                ans.add(false);
            } else {
                ans.add(true);
            }
        }
        return ans;
    }
}
