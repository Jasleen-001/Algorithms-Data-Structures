package com.jasleen.RippleQuestions;

public class OptimizedPalindrome {
    public static void main(String[] args) {
        System.out.println(getPalindrome(15251));
    }

    private static boolean getPalindrome(int x) {
        if(x<0 || (x%10==0 && x!=0))
            return false;
        int revNo=0;
        while(x>revNo){
            revNo=revNo*10+x%10;
            x/=10;
        }
        return (x==revNo || x==revNo/10) ;
    }

}
