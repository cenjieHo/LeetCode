package algorithms.NAC.subsetsII;

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
        LinkedList<Integer> temp = new LinkedList<>();
        res.add(new ArrayList<>(temp));
        subsetsWithDupCore(res, temp, nums, 0);
        return res;
    }
    
    private void subsetsWithDupCore(List<List<Integer>> res, LinkedList<Integer> temp, int[] nums, int index) {
    	for(int i = index; i < nums.length; i++) {
    		if(i > index && nums[i] == nums[i-1]) continue;
    		temp.add(nums[i]);
    		res.add(new ArrayList<>(temp));
    		subsetsWithDupCore(res, temp, nums, i+1);
    		temp.removeLast();
    	}
    }
}
