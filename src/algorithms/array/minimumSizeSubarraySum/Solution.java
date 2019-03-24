package algorithms.array.minimumSizeSubarraySum;

public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums == null || nums.length == 0) {
        	return 0;
        }
        int res = Integer.MAX_VALUE;
        int sum = nums[0];
        int left = 0;
        int right = 0;
        boolean flag = false;
        while(left <= right && right < nums.length) {
        	if(sum >= s) {
        		flag = true;
        		res = (right - left + 1) < res ? right - left + 1 : res;
        		sum -= nums[left];
        		left++;
        	} else {
        		right++;
        		if(right < nums.length) sum += nums[right];
        	}
        }
        return flag ? res : 0;
    }
}
