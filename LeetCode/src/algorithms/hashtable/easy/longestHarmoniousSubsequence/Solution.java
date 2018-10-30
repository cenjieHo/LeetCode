package algorithms.hashtable.easy.longestHarmoniousSubsequence;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findLHS(int[] nums) {
    	if(nums == null || nums.length == 0)
    		return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
        	map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	int key = entry.getKey();
        	int val = entry.getValue();
        	if(map.containsKey(key+1)) {
        		max = max > val + map.get(key+1) ? max : val + map.get(key+1);
        	}
        }
        return max;
    }
}
