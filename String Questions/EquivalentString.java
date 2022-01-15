package com.jasleen.StringsPQ;
// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
  /* Brute Force Approach */
public class EquivalentString {
    public static void main(String[] args) {
        String[] word1={"a","bc"};
        String[] word2={"ab","c"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if(String.join("",word1).equals(String.join("",word2)))
            return true;
        return false;
    }

}
