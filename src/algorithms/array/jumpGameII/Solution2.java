package algorithms.array.jumpGameII;

public class Solution2 {
    public int jump(int[] nums) {
    	if(nums == null || nums.length <= 1) 
    		return 0;
    	int curMax = 0;
    	int max = 0;
    	int count = 0;
    	for(int i = 0; i < nums.length-1; i++) {
    		max = Math.max(max, nums[i] + i);
    		if(i == curMax) {
    			count++;
    			curMax = max;
    		}
    	}
    	return count;
    }
}
