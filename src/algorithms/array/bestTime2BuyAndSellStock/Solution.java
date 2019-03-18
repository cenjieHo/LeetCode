package algorithms.array.bestTime2BuyAndSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
    	if(prices == null || prices.length == 0) return 0;
    	int maxProfit = 0;
    	int minPrices = prices[0];
    	for(int i = 1; i < prices.length; i++) {
    		if(prices[i] < minPrices) {
    			minPrices = prices[i];
    		}
    		int profit = prices[i] - minPrices;
    		if(profit > maxProfit) {
    			maxProfit = profit;
    		}
    	}
    	return maxProfit;
    }
}
