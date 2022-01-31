package com.jasleen.ArraysPQ;
// https://leetcode.com/problems/plus-one/
import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits={4,3,2,2};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits){
        ArrayList<Integer> arr=new ArrayList<>();
        int num=1;
        for(int i= digits.length-1;i>=0;i--){
            num+=digits[i];
            arr.add(0,num%10);
            num/=10;
        }
        while(num!=0){
            arr.add(0,num%10);
            num/=10;
        }
        int[] newDigits=new int[arr.size()];
        for(int i=0;i< arr.size();i++){
            newDigits[i]= arr.get(i);
        }
        return newDigits;
    }
}
