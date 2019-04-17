package algorithms.backtracking.permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	List<List<Integer>> res;
	
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        permuteCore(nums, 0);
        return res;
    }
    
    private void permuteCore(int[] nums, int index) {
    	if(index == nums.length-1) {
    		List<Integer> list = new ArrayList<>();
    		for(int i = 0; i < nums.length; i++) 
    			list.add(nums[i]);
    		res.add(list);
    		return;
    	}
    	for(int i = index; i < nums.length; i++) {
    		swap(nums, index, i);
    		permuteCore(nums, index+1);
    		swap(nums, index, i);
    	}
    }
    
    private void swap(int[] nums, int i, int j) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
}
