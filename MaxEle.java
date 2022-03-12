//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
import java.util.Arrays;

public class MaxEle {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int min=prices[0];
        int maxProf=0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            int prof = prices[i]-min;
            if(maxProf < prof){
                maxProf=prof;
            }
        }
        return maxProf;
    }
}
