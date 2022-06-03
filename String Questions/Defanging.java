package com.jasleen.StringsPQ;
//https://leetcode.com/problems/defanging-an-ip-address/
public class Defanging {
    public static void main(String[] args) {
        System.out.println(defang("1.1.1.1"));
        //another method
        System.out.println(defangOne("1.1.1.1"));
    }

    private static String defangOne(String s) {
        return s.replace(".","[.]");
    }

    private static String defang(String s) {
        String j="[.]";
        StringBuilder abc=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.'){
                abc.append(j);
            }
            else
                abc.append(s.charAt(i));
        }
        return String.valueOf(abc);
    }
}
