package algorithms.NAC.maximumProductSubarray;

public class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0)
        	return 0;
        int res = nums[0];
        int max = nums[0];
        int min = nums[0];
        for(int i = 1; i < nums.length; i++) {
        	int temp = max;
        	max = Math.max(Math.max(nums[i] * max, nums[i] * min), nums[i]);
        	min = Math.min(Math.min(nums[i] * temp, nums[i] * min), nums[i]);
        	res = Math.max(res, max);
        }
        return res;
    }
}

/**
Example 1:

Input: [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
*/