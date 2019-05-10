package algorithms.binarysearch.findMinimumInRotatedSortedArray;

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
        	} else {
        		lo = mid + 1;
        	}
        }
        return nums[hi];
    }
}

/* 
 
1 2

*/
