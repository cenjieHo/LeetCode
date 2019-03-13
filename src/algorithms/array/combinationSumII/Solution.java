package algorithms.array.combinationSumII;

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
        combinationSumCore(candidates, target, 0);
        return res;
    }
    
    private void combinationSumCore(int[] candidates, int target, int begin) {
    	if(target < 0) 
    		return;
    	if(target == 0) {
    		res.add(temp);
    		temp = new LinkedList<>(temp);
    		return;
    	}
    	for(int i = begin; i < candidates.length; i++) {
    		if(i > begin && candidates[i] == candidates[i-1]) continue;
	    	temp.push(candidates[i]);
	    	combinationSumCore(candidates, target-candidates[i], i+1);
	    	temp.pop();
    	}
    }
}

/**
Input: candidates = [10,1,2,7,6,1,5], target = 8,
					[1,1,2,5,6,7,10]
A solution set is:
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]
*/







