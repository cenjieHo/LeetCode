package algorithms.binarysearch.findMinimumInRotatedSortedArrayII;

public class Solution {
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0)
        	return -1;
        int lo = 0;
        int hi = nums.length-1;
        while(lo < hi) {
        	int mid = lo + (hi - lo) / 2;
        	if(nums[mid] < nums[nums.length-1]) {
        		hi = mid;
        	} else if(nums[mid] > nums[nums.length-1]){
        		lo = mid + 1;
        	} else {
        		int min = nums[0];
        		for(int i = 1; i < nums.length; i++)
        			if(nums[i] < min) min = nums[i];
        		return min;
        	}
        }
        return nums[hi];
    }
}

/*
 1 0 1 1 1
*/