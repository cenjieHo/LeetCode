package algorithms.array.missingNumber;

public class Solution2 {
    public int missingNumber(int[] nums) {
        if(nums == null || nums.length <= 0)
        	return -1;
        
        int total = nums.length * (nums.length+1) / 2;
        int cur = 0;
        
        for(int i = 0; i < nums.length; i++) {
        	cur+=nums[i];
        }
        return total-cur;
    }
}
