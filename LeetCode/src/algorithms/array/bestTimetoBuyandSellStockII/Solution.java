package algorithms.array.bestTimetoBuyandSellStockII;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lo = 0;
        int hi = 0;
        for(int i = 0; i < prices.length; i++) {
        	while(i < prices.length-1  && prices[i] > prices[i+1])
        		i++;
        	lo = i;
        	while(i < prices.length-1 && prices[i] < prices[i+1])
        		i++;
        	hi = i;
        	maxProfit += prices[hi] - prices[lo];
        }
        return maxProfit;
    }
}
