package com.jasleen.StringsPQ;

import java.util.Locale;
import java.util.Set;

// https://leetcode.com/problems/determine-if-string-halves-are-alike/
public class StringHalves {
    public static void main(String[] args) {
        String s="textbook";
        System.out.println(halvesAreAlike(s));
    }

  /*  public static boolean halvesAreAlike(String s){
        String one=s.toLowerCase(Locale.ROOT).substring(0,s.length()/2);
        String two=s.toLowerCase(Locale.ROOT).substring(s.length()/2);
        char[] vowels={'a','e','i','o','u'};
        int c1=0,c2=0;
        for(int i=0;i<one.length();i++){
            for(int j=0;j<vowels.length;j++){
                if(one.charAt(i)==vowels[j])
                    c1++;
                if(two.charAt(i)==(vowels[j]))
                    c2++;
            }
        }
        return(c1==c2);
    }*/

    public static boolean halvesAreAlike(String s){
        int c1=0,c2=0;
        Set vowels= Set.of('a','e','i','o','u','A','E','I','O','U');
        int left=0,right=s.length()-1;
        while(left<right){
            c1+=vowels.contains(s.charAt(left))?1:0;
            c2+=vowels.contains(s.charAt(right))?1:0;
            left++;
            right--;
        }
        return c1==c2;
    }
}
