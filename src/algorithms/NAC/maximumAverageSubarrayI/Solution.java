package algorithms.NAC.maximumAverageSubarrayI;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k == 0)
        	return 0;
        int sum = 0;
        int max = 0;
        for(int i = 0; i < k; i++) {
        	sum += nums[i];
        }
        max = sum;
        for(int i = k; i < nums.length; i++) {
        	sum += nums[i] - nums[i-k];
        	max = Math.max(max, sum);
        }
        return (max * 1.0) / k;
    }
}

/**
Example 1:

Input: [1,12,-5,-6,50,3], k = 4
Output: 12.75
Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
*/