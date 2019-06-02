package algorithms.NAC.bestTime2BuyAndSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
    	if(prices == null || prices.length == 0)
    		return 0;
        int max = 0;
        int min = prices[0];
        for(int i = 1; i < prices.length; i++) {
        	max = (prices[i] - min > max) ? prices[i] - min : max;
        	min = prices[i] < min ? prices[i] : min;
        }
        return max;
    }
}
