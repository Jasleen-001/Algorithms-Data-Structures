package com.jasleen.PracticeQuestions;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] arr={-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }

        public static int largestAltitude(int[] gain) {
            int[] alt=new int[gain.length+1];
            alt[0]=0;
            for(int i=0;i<gain.length;i++){
                alt[i+1]=alt[i]+gain[i];
            }
            int max=alt[0];
            for(int i=1;i<alt.length;i++){
                if(alt[i]>max)
                    max=alt[i];
            }
            return max;
        }
    }


