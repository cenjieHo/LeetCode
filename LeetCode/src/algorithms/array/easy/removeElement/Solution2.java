package algorithms.array.easy.removeElement;

public class Solution2 {
    public int removeElement(int[] nums, int val) {
    	int i = 0;
    	for(int j = i; j < nums.length; j++) {
    		if(nums[j] != val) {
    			nums[i] = nums[j];
    			i++;
    		}
    	}
    	
    	return i;
    }
}
