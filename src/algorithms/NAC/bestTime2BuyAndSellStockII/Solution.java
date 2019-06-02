package algorithms.NAC.bestTime2BuyAndSellStockII;

public class Solution {
    public int maxProfit(int[] prices) {
    	if(prices == null || prices.length == 0)
    		return 0;
        int max = 0;
        for(int i = 0; i < prices.length; i++) {
        	while(i < prices.length - 1 && prices[i] >= prices[i+1])
        		i++;
        	int lo = i;
        	while(i < prices.length - 1 && prices[i] <= prices[i+1])
        		i++;
        	int hi = i;
        	max += prices[hi] - prices[lo];
        }
        return max;
    }
}
