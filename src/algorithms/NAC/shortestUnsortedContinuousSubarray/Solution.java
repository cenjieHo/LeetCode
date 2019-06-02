package algorithms.NAC.shortestUnsortedContinuousSubarray;

import java.util.Arrays;

public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums == null || nums.length == 0)
        	return 0;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int start = nums.length;
        int end = 0;
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] != sorted[i]) {
        		start = Math.min(i, start);
        		end = i;
        	}
        }
        return end - start >= 0 ? end - start + 1 : 0;
    }
}
