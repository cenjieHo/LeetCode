package algorithms.NAC.searchInRotatedSortedArrayII;

public class Solution {
    public boolean search(int[] nums, int target) {
        if(nums == null || nums.length == 0)
        	return false;
        int lo = 0;
        int hi = nums.length-1;
        while(lo < hi) {
        	int mid = lo + (hi - lo) / 2;
        	if(nums[mid] < nums[nums.length-1]) {
        		hi = mid;
        	} else if(nums[mid] > nums[nums.length-1]) {
        		lo = mid + 1;
        	} else {
        		return linearSearch(nums, target);
        	}
        }
        int rotate = lo;
        if(target > nums[nums.length-1]) {
        	return binarySearch(nums, 0, rotate-1, target);
        } else if(target < nums[nums.length-1]) {
        	return binarySearch(nums, rotate, nums.length-1, target);
        } else {
        	return true;
        }
    }
    
    private boolean binarySearch(int[] nums, int lo, int hi, int target) {
    	while(lo <= hi) {
    		int mid = lo + (hi - lo) / 2;
    		if(target < nums[mid]) {
    			hi = mid - 1;
    		} else if(target > nums[mid]) {
    			lo = mid + 1;
    		} else {
    			return true;
    		}
    	}
    	return false;
    }
    
    private boolean linearSearch(int[] nums, int target) {
    	for(int i = 0; i < nums.length; i++) {
    		if(nums[i] == target) return true;
    	}
    	return false;
    }
}
