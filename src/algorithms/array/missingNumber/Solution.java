package algorithms.array.missingNumber;

import java.util.HashSet;

public class Solution {
    public int missingNumber(int[] nums) {
        if(nums == null || nums.length <= 0)
        	return -1;
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
        	set.add(nums[i]);
        }
        
        for(int i = 0; i <= nums.length; i++) {
        	if(!set.contains(i)) {
        		return i;
        	}
        }
        
        return -1;
    }
}
