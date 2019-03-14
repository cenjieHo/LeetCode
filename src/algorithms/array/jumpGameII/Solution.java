package algorithms.array.jumpGameII;

public class Solution {
    public int jump(int[] nums) {
    	if(nums == null || nums.length <= 1) 
    		return 0;
    	int[] dp = new int[nums.length];
    	dp[0] = 0;
    	for(int i = 1; i < nums.length; i++) {
    		int minIndex = -1;
    		for(int j = 0; j < i; j++) {
    			if(i - j <= nums[j] && (minIndex == -1 || dp[j] < dp[minIndex])) {
	    			minIndex = j;
    			}
    		}
    		dp[i] = dp[minIndex] + 1;
    	}
    	return dp[nums.length-1];
    }
}
