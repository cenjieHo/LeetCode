package algorithms.array.jumpGame;

public class Solution {
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for(int i = 1; i < nums.length; i++) {
        	for(int j = 0; j < i; j++) {
        		if(dp[j] && i-j <= nums[j]) {
        			dp[i] = true;
        			break;
        		}
        	}
        }
        return dp[nums.length-1];
    }
}
