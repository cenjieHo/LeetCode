package algorithms.dynamicProgramming.houseRobber;

import java.util.Arrays;

public class Solution2 {
	int[] memo;	
	
    public int rob(int[] nums) {
    	memo = new int[nums.length];
    	Arrays.fill(memo, -1);
        return rob(nums, nums.length-1);
    }
    
    private int rob(int[] nums, int i) {
    	if(i < 0)
    		return 0;
    	if(memo[i] >= 0)
    		return memo[i];
    	int res = Math.max(rob(nums, i-2)+nums[i], rob(nums, i-1));
    	memo[i] = res;
    	return res;
    }
}
