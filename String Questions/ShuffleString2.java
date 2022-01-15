package com.jasleen.StringsPQ;
//  https://leetcode.com/problems/sorting-the-sentence/
public class ShuffleString2 {
    public static void main(String[] args) {
        String s="Myself2 Me1 I4 and3";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s){
        String[] words=s.split(" ");
        String[] sol=new String[words.length];
        for(int i=0;i<words.length;i++){
            String temp="";
            int index=Integer.parseInt(words[i].substring(words[i].length()-1));
            temp=words[i].substring(0,words[i].length()-1);
            sol[index-1]=temp;
        }
        return String.join(" ",sol);
    }
}
