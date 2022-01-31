package com.jasleen.ArraysPQ;
//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
public class MoveChips {
    public static void main(String[] args) {
        int[] position={1,1000000000};
        System.out.println(minCost(position));
    }
    public static int minCost(int[] position){
        int even=0,odd=0;
        for(int i:position){
            if ((i&1)==1) {
                odd++;
            } else {
                even++;
            }
        }
        return Math.min(even,odd);
    }
}
