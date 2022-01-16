package com.jasleen.StringsPQ;
// https://leetcode.com/problems/length-of-last-word/submissions/
import java.util.Arrays;

public class LastWord {
    public static void main(String[] args) {
        String s="   fly me   to   the moon  ";
       System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s){
            String j=s.trim();
            String[] sol=j.split(" ");
            return sol[sol.length-1].length();

    }
}
