package algorithms.array.longestContinuousIncreasingSubsequence;

public class Solution {
    public int findLengthOfLCIS(int[] nums) {
    	if(nums == null || nums.length <= 0)
    		return 0;
    	
        int curr = 1;
        int max = 1;
        for(int i = 1; i < nums.length; i++) {
        	if(nums[i] > nums[i-1]) {
        		curr++;
        	} else {
        		curr = 1;
        	}
        	if(curr > max)
        		max = curr;
        }
        return max;
    }
}
