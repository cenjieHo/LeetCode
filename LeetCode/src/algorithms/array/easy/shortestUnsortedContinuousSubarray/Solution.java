package algorithms.array.easy.shortestUnsortedContinuousSubarray;

import java.util.Arrays;

public class Solution {
    public int findUnsortedSubarray(int[] nums) {
    	int start = nums.length;
    	int end = 0;
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] != sortedNums[i]) {
        		start = Math.min(i, start);
        		end = Math.max(i, end);
        	}
        }
        return (end - start) > 0 ? end-start+1 : 0;
    }
}
