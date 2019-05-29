package algorithms.NAC.nextPermutation;

public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0)
        	return;
        for(int i = nums.length-2; i >= 0; i--) {
        	if(nums[i] < nums[i+1]) {
        		for(int j = nums.length-1; j > i; j--) {
        			if(nums[j] > nums[i]) {
        				swap(nums, i, j);
        				reverse(nums, i+1, nums.length-1);
        				return;
        			}
        		}
        	}
        }
        reverse(nums, 0, nums.length-1);
    }
    
    private void swap(int[] nums, int i, int j) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
    
    private void reverse(int[] nums, int lo, int hi) {
    	while(lo <= hi) {
    		swap(nums, lo, hi);
    		lo++;
    		hi--;
    	}
    }
}

/**
1 2 3 4 5 6
1 2 3 4 6 5
1 2 3 6 4 5
1 2 3 6 5 4
1 2 6 3 4 5
1 2 6 4 3 5
1 2 6 4 5 3
1 2 6 5 3 4
1 2 6 5 4 3
1 3 2 4 5 6
*/ 