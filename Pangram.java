package com.jasleen.PracticeQuestions;
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/submissions/
import java.lang.String;
public class Pangram {
    public static void main(String[] args) {
        String sentence="the quick brown fox jumps over the lazy dog";
        System.out.println(Solution(sentence));

    }
    public static boolean Solution(String sentence){

        if(sentence.length()<26)
            return false;
        for(int i='a';i<='z';i++){
            if(sentence.indexOf(i)==-1)
                return false;
        }
        /*   BRUTE FORCE
          int check;
         for(char alpha='a';alpha<='z';alpha++){
            check=0;
            for(int i=0;i<sentence.length();i++){
                if(sentence.charAt(i)==alpha) {
                    check++;
                    break;
                }
            }
           if(check==0) return false;
        }
        return true;

       */

        return true;
    }
}
