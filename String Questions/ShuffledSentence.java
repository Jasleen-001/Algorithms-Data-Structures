package com.jasleen.StringsPQ;
// https://leetcode.com/problems/sorting-the-sentence/
public class ShuffledSentence {
    public static void main(String[] args) {
        String s="Myself2 Me1 I4 and3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s){
        String[] words=s.split(" "); //split the string and store into in an array
        String[] sol=new String[words.length]; //new array for storing set string
        StringBuilder mysol=new StringBuilder(); //to retun the set string array as string
        for(int i=0;i<words.length;i++){
            int index=Integer.parseInt(String.valueOf(words[i].charAt(words[i].length()-1)));
            if((index-1)!=0)
                sol[index-1]=" ";
            else
                sol[index-1]="";
            for(int j=0;j<words[i].length()-1;j++){
                sol[index-1]+=String.valueOf(words[i].charAt(j));
            }
        }
        for(String a:sol){
            mysol.append(a);
        }

        return mysol.toString();
    }
}
