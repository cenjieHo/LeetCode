package algorithms.NAC.jumpGame;

public class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        int curMax = 0;
        for(int i = 0; i < nums.length-1; i++) {
        	max = Math.max(max, nums[i]+i);
        	if(i == curMax) {
        		if(max == curMax) return false;
        		curMax = max;
        	}
        }
        return true;
    }
}
