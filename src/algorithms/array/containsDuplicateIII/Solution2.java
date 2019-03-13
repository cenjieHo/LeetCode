package algorithms.array.containsDuplicateIII;

import java.util.TreeSet;

public class Solution2 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
    	TreeSet<Long> set = new TreeSet<>();
    	for(int i = 0; i < nums.length; i++) {
    		Long floor = set.floor((long) nums[i]);
    		Long ceil = set.ceiling((long) nums[i]);
    		if((floor != null && Math.abs(floor-nums[i]) <= t) 
    				|| (ceil != null && Math.abs(ceil-nums[i]) <= t))
    			return true;
    		set.add((long) nums[i]);
    		if(i >= k) set.remove((long)nums[i-k]);
    	}
    	return false;
    }
}
