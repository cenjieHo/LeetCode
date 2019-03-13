package algorithms.array.removeDuplicatesFromSortedArrayII;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int times = 1;
        int j = 1;
        for(int i = 1; i < nums.length; i++) {
        	if(nums[i] == nums[i-1]) {
        		if(times < 2) {
        			nums[j] = nums[i];
        			times++;
        			j++;
        		}
        	} else {
        		nums[j] = nums[i];
        		times = 1;
        		j++;
        	}
        }
        return j;
    }
}
