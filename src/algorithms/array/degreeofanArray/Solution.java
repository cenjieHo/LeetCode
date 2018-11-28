package algorithms.array.degreeofanArray;

import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
        	int num = nums[i];
        	if(left.get(num) == null)
        		left.put(num, i);
        	right.put(num, i);
        	count.put(num, count.getOrDefault(num, 0)+1);
        }
        
        int degree = Collections.max(count.values());
        int shortest = Integer.MAX_VALUE;
        for(int num : count.keySet()) {
        	if(count.get(num) == degree) {
        		shortest = Math.min(shortest, right.get(num) - left.get(num) + 1);
        	}
        }
        return shortest;
    }
}
