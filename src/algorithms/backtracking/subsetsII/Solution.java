package algorithms.backtracking.subsetsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    	List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0)
        	return res;
        Arrays.sort(nums);
        List<Integer> temp = new LinkedList<>();
        res.add(temp);
        subsetsWithDupCore(res, temp, nums, 0);
        return res;
    }
    
    private void subsetsWithDupCore(List<List<Integer>> res, List<Integer> temp, int[] nums, int pos) {
    	for(int i = pos; i < nums.length; i++) {
    		temp.add(nums[i]);
    		res.add(new ArrayList<>(temp));
    		subsetsWithDupCore(res, temp, nums, i+1);
    		temp.remove(temp.size()-1);
    		while(i+1 < nums.length && nums[i] == nums[i+1]) i++;
    	}
    }
}
