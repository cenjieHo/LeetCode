package algorithms.array._3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0) return res;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
        	if(i != 0 && nums[i] == nums[i-1]) continue;
        	int target = -nums[i];
    		int lo = i+1;
    		int hi = nums.length-1;
        	while(lo < hi) {
        		if(nums[lo] + nums[hi] < target) {
        			lo++;
        		} else if(nums[lo] + nums[hi] > target) {
        			hi--;
        		} else {
        			if((lo == i + 1 || nums[lo] != nums[lo-1]) 
        					&& (hi == nums.length-1 || nums[hi] != nums[hi+1])) {
        				List<Integer> list = new ArrayList<>();
        				list.add(nums[i]);
        				list.add(nums[lo]);
        				list.add(nums[hi]);
        				res.add(list);
        			}
        			lo++;
        			hi--;
        		}
        	}
        }
        return res;
    }
}

/**
Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
*/