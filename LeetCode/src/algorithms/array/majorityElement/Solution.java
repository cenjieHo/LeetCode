package algorithms.array.majorityElement;

public class Solution {
    public int majorityElement(int[] nums) {
    	if(nums == null || nums.length <= 0)
    		return -1;
    	
        int e = nums[0];
        int count = 1;
        
        for(int i = 1; i < nums.length; i++) {
        	if(count == 0) {
        		e = nums[i];
        		count = 1;
        		continue;
        	}
        	if(nums[i] == e) {
        		count++;
        	} else {
        		count--;
        	}
        }
        return e;
    }
}
