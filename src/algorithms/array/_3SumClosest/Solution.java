package algorithms.array._3SumClosest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
    	int closest = Integer.MAX_VALUE;
    	int res = 0;
    	Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
        	if(i != 0 && nums[i] == nums[i-1]) continue;
        	int t = target-nums[i];
    		int lo = i+1;
    		int hi = nums.length-1;
        	while(lo < hi) {
        		if(Math.abs(nums[lo] + nums[hi] - t) < closest){
        			closest = Math.abs(nums[lo] + nums[hi] - t);
        			res = nums[lo] + nums[hi] + nums[i];
        		}
        		if(nums[lo] + nums[hi] > t) {
        			hi--;
        		} else if(nums[lo] + nums[hi] < t) {
        			lo++;
        		} else {
        			return res;
        		}
        	}
        }
        return res;
    }
}
