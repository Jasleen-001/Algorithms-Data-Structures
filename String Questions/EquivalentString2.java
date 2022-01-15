package com.jasleen.StringsPQ;
//  https://leetcode.com/problems/sorting-the-sentence/
   /* Using StringBuilder Class as they are much faster than String class */
    /* This is an optiomal approach */
public class EquivalentString2 {
    public static void main(String[] args) {
        String[] word1={"a","bc"};
        String[] word2={"ab","c"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(String a:word1)
            s1.append(a);
        for(String b:word2)
            s2.append(b);
        return s1.toString().equals(s2.toString());
    }
}
