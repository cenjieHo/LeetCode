package algorithms.NAC.subsets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0)
        	return res;
        LinkedList<Integer> temp = new LinkedList<>();
        res.add(temp);
        subSetsCore(res, temp, nums, 0);
        return res;
    }
    
    private void subSetsCore(List<List<Integer>> res, LinkedList<Integer> temp, int[] nums, int pos) {
    	for(int i = pos; i < nums.length; i++) {
    		temp.add(nums[i]);
    		res.add(new ArrayList<>(temp));
    		subSetsCore(res, temp, nums, i+1);
    		temp.removeLast();
    	}
    }
}
