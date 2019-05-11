package algorithms.binarysearch.findPeakElement;

public class Solution {
    public int findPeakElement(int[] nums) {
        if(nums == null || nums.length == 0)
        	return -1;
        int lo = 0;
        int hi = nums.length-1;
        while(lo < hi) {
        	int mid = lo + (hi - lo) / 2;
        	if((mid-1<0 || nums[mid]>nums[mid-1]) 
        			&& (mid+1>=nums.length || nums[mid]>nums[mid+1])) {
        		return mid;
        	} else if((mid-1<0 || nums[mid] > nums[mid-1]) 
        			&& (mid+1<nums.length && nums[mid] < nums[mid+1])) {
        		lo = mid + 1;
        	} else if ((mid-1>=0 && nums[mid]<nums[mid-1]) 
        			&& (mid+1>=nums.length || nums[mid] > nums[mid+1])) {
        		hi = mid - 1;
        	} else {
        		lo = mid + 1;
        	}
        }
        return lo;
    }
}
