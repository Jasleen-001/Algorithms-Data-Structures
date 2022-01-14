package com.jasleen.StringsPQ;
//https://leetcode.com/problems/shuffle-string/
public class ShuffleString {
    public static void main(String[] args) {
        String s="leetcode";
        int[] indices={4,5,6,7,0,2,1,3};
        System.out.println(Solution(s,indices));
    }
    public static String Solution(String s,int[] indices){
        char[] str=new char[indices.length];
        for(int i=0;i<indices.length;i++) {
            str[indices[i]] = s.charAt(i);
        }
        return String.valueOf(str);
    }

}
