package algorithms.array.jumpGame;

public class Solution2 {
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        if(nums.length == 1) return true;
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for(int i = 0; i < nums.length; i++) {
        	if(dp[i]) {
        		for(int j = i + 1; j <= i + nums[i]; j++) {
        			if(j == nums.length-1) return true;
        			dp[j] = true;
        		}
        	}
        }
        return false;
    }
}
