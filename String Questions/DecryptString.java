package com.jasleen.StringsPQ;
// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
public class DecryptString {
    public static void main(String[] args) {
        String s="1326#";
        System.out.println(freqAlphabets(s));
    }
    public static String freqAlphabets(String s){
        StringBuilder m=new StringBuilder();
        int i=0;
        while(i<s.length()){
            if((i+2)<s.length() && s.charAt(i+2)=='#'){
                int num=Integer.parseInt(s.substring(i,i+2));
                m.append((char)('a'+num-1));
                i+=3;
            }
            else {
                int num=Integer.parseInt(s.substring(i,i+1));
                m.append((char) ('a'+num-1));
                i++;
            }
        }
        return m.toString();
    }
}
