package algorithms.dynamicProgramming.uniquePathsII;

public class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
    	if(grid[0][0] == 1) return 0;
        int m = grid[0].length;
        int n = grid.length;
        int[] dp = new int[m];
        dp[0] = 1;
        for(int i = 1; i < m; i++) {
        	if(grid[0][i] != 1) dp[i] = dp[i-1];
        }
        for(int i = 1; i < n; i++) {
        	if(grid[i][0] == 1) {
        		dp[0] = 0;
        	}
        	for(int j = 1; j < m; j++) {
        		if(grid[i][j] != 1) {
        			dp[j] = dp[j] + dp[j-1];
        		} else {
        			dp[j] = 0;
        		}
        	}
        }
        return dp[m-1];
    }
}
