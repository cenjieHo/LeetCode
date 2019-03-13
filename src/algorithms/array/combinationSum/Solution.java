package algorithms.array.combinationSum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	List<List<Integer>> res;
	LinkedList<Integer> temp;
	
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        temp = new LinkedList<>();
        if(candidates == null || candidates.length == 0) return res;
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
    		temp.push(candidates[i]);
    		combinationSumCore(candidates, target-candidates[i], i);
    		temp.pop();
    	}
    }
}

/**
Input: candidates = [2,3,5], target = 8,
A solution set is:
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]
*/