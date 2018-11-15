package algorithms.dynamicProgramming.houseRobber;

public class Solution4 {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int prev1 = nums[0];
        int prev2 = Math.max(nums[1], prev1);
        for(int i = 2; i < nums.length; i++) {
        	int curr = Math.max(prev1+nums[i], prev2);
        	prev1 = prev2;
        	prev2 = curr;
        }
        return prev2;
    }
}
