package algorithms.array.easy.maxConsecutiveOnes;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    	if(nums == null || nums.length <= 0)
    		return -1;
    	
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] == 1) {
        		cnt++;
        	} else {
        		cnt = 0;
        	}
        	if(cnt > max) {
        		max = cnt;
        	}
        }
        
        return max; 
    }
}
