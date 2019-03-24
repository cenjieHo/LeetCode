package algorithms.array.bestTime2BuyAndSellStockWithCooldown;

public class Solution {
    public int maxProfit(int[] prices) {
        int hold = Integer.MIN_VALUE;
        int sold = 0;
        int rest = 0;
        for(int price : prices) {
        	hold = Math.max(hold, rest - price);
        	rest = Math.max(rest, sold);
        	sold = hold + price;
        }
        return Math.max(rest, sold);
    }
}
