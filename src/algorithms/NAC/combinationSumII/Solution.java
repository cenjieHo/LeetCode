package algorithms.NAC.combinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	List<List<Integer>> res;
	LinkedList<Integer> temp;
	
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    	res = new ArrayList<>();
    	temp = new LinkedList<>();
        if(candidates == null || candidates.length == 0)
        	return res;
        Arrays.sort(candidates);
        combinationSum2Core(candidates, target, 0);
        return res;
    }
    
    private void combinationSum2Core(int[] candidates, int target, int begin) {
    	if(target < 0)
    		return;
    	if(target == 0) {
    		res.add(new ArrayList<>(temp));
    		return;
    	}
    	for(int i = begin; i < candidates.length; i++) {
    		if(i != 0 && candidates[i] == candidates[i-1]) continue;
    		temp.push(candidates[i]);
    		combinationSum2Core(candidates, target-candidates[i], i+1);
    		temp.pop();
    	}
    }
}
