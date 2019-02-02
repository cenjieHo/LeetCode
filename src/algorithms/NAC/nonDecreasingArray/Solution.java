package algorithms.NAC.nonDecreasingArray;

public class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
        	if(nums[i] < nums[i-1]) {
        		if(count == 1) {
        			if(i - 2 < 0 || nums[i] > nums[i-2]) {
        				nums[i-1] = nums[i];
        			} else {
        				nums[i] = nums[i-1];
        			}
        			count--;
        		} else {
        			return false;
        		}
        	}
        }
        return true;
    }
}
