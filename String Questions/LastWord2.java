package com.jasleen.StringsPQ;
// https://leetcode.com/problems/length-of-last-word/submissions/
public class LastWord2 {
    public static void main(String[] args) {
        String s="   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s){
        // Preprocess string - trim
        String trimmed = s.trim();
        // Find last space
        int lastSpaceIndex = trimmed.lastIndexOf(' ');
        // find last word: do a substring starting in the last space
        String lastWord = trimmed.substring(lastSpaceIndex + 1);
        // return length of the last word
        return lastWord.length();

    }
}
