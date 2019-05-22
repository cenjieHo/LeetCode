package algorithms.NAC.combinationSum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	List<List<Integer>> res;
	LinkedList<Integer> temp;
	
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	res = new ArrayList<>();
    	temp = new LinkedList<>();
        if(candidates == null || candidates.length == 0)
        	return res;
        combinationSum(candidates, target, 0);
        return res;
    }
    
    private void combinationSum(int[] candidates, int target, int begin) {
    	if(target < 0)
    		return;
    	if(target == 0) {
    		res.add(new ArrayList<>(temp));
    	}
    	for(int i = begin; i < candidates.length; i++) {
    		temp.push(candidates[i]);
    		combinationSum(candidates, target-candidates[i], i);
    		temp.pop();
    	}
    }
}
