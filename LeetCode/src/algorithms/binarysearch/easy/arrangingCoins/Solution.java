package algorithms.binarysearch.easy.arrangingCoins;

public class Solution {
    public int arrangeCoins(int n) {
    	int i = 0;
        while(n > 0) {
        	i++;
        	n -= i;
        }
        return n == 0 ? i : i-1;
    }
}
