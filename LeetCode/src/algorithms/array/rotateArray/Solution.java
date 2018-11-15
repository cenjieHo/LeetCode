package algorithms.array.rotateArray;

public class Solution {
    public void rotate(int[] nums, int k) {
    	if(nums == null || nums.length <= 0 || k == nums.length || k <= 0 )
    		return;
    	
    	k = k % (nums.length);
    	
        int[] arr = new int[k];
        for(int i = nums.length-k, j = 0; i < nums.length; i++, j++) {
        	arr[j] = nums[i];
        }
        
        for(int i = nums.length-k-1; i >= 0; i--) {
        	nums[i+k] = nums[i];
        }
        
        for(int i = 0; i < k; i++) {
        	nums[i] = arr[i];
        }
    }
}
