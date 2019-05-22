package algorithms.NAC.permutationsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	List<List<Integer>> res;
	
    public List<List<Integer>> permuteUnique(int[] nums) {
        res = new ArrayList<>();
        if(nums == null || nums.length == 0)
        	return res;
        permuteCore(nums, 0);
        return res;
    }
    
    private void permuteCore(int[] nums, int index) {
    	if(index == nums.length-1) {
    		List<Integer> temp = new ArrayList<>();
    		for(int i = 0; i < nums.length; i++)
    			temp.add(nums[i]);
    		res.add(temp);
    		return;
    	}
    	Set<Integer> set = new HashSet<>();
    	for(int i = index; i < nums.length; i++) {
    		if(set.add(nums[i])) {
	    		swap(nums, index, i);
	    		permuteCore(nums, index+1);
	    		swap(nums, index, i);
    		}
    	}
    }
    
    private void swap(int[] nums, int i, int j) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
}
