package algorithms.array.largestNumberAtLeastTwiceOfOthers;

public class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length == 1)
        	return 0;
        int max1 = nums[0] >= nums[1] ? 0 : 1;
        int max2 = 1 - max1;
        for(int i = 2; i < nums.length; i++) {
        	if(nums[i] > nums[max1]) {
        		int temp = max1;
        		max1 = i;
        		max2 = temp;
        	} else if(nums[i] > nums[max2]) {
        		max2 = i;
        	}
        }
        return nums[max1] >= nums[max2]*2 ? max1 : -1;
    }
}
