package algorithms.dynamicProgramming.maximalSquare;

public class Solution {
    public int maximalSquare(char[][] matrix) {
    	if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
    		return 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < dp.length; i++) {
        	for(int j = 0; j < dp[0].length; j++) {
        		if(matrix[i][j] == '1') {
        			if(i == 0 || j == 0) {
        				dp[i][j] = 1;
        				max = Math.max(dp[i][j], max);
        				continue;
        			}
        			dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j])) + 1;
        			max = Math.max(dp[i][j], max);
        		}
        	}
        }
        return max * max;
    }
}
