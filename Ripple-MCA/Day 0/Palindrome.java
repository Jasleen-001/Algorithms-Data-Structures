package com.jasleen.RippleQuestions;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(getPalinderome(1015));
    }
    public static boolean getPalinderome(int x){
        if(x<0)
            return false;
        int sum=0;
        int p=-1;
        int num=Math.abs(x);
        int z=Math.abs(x);
        while(z>0){
            z/=10;
            p++;
        }
        while(num!=0){
            int n= num%10;
            sum+=(int)(n*Math.pow(10,p));
            p--;
            num =num/10;
        }
        return (sum==x);
    }
}
