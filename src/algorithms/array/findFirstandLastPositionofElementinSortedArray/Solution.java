package algorithms.array.findFirstandLastPositionofElementinSortedArray;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
    	int[] range = {-1, -1};
        if(nums == null || nums.length == 0) return range;
        int f = findFirst(nums, target);
        int l = findLast(nums, target);
        range[0] = f;
        range[1] = l;
        return range;
    }
    
    private int findFirst(int[] nums, int target) {
    	int lo = 0;
    	int hi = nums.length-1;
    	while(lo <= hi) {
    		int mid = lo + (hi - lo) / 2;
    		if(nums[mid] > target) {
    			hi = mid - 1;
    		} else if(nums[mid] < target) {
    			lo = mid + 1;
    		} else {
    			if(mid > 0 && nums[mid] == nums[mid-1]) {
    				hi = mid - 1;
    			} else {
    				return mid;
    			}
    		}
    	}
    	return -1;
    }
    
    private int findLast(int[] nums, int target) {
    	int lo = 0;
    	int hi = nums.length-1;
    	while(lo <= hi) {
    		int mid = lo + (hi - lo) / 2;
    		if(nums[mid] > target) {
    			hi = mid - 1;
    		} else if(nums[mid] < target) {
    			lo = mid + 1;
    		} else {
    			if(mid < nums.length-1 && nums[mid] == nums[mid+1]) {
    				lo = mid + 1;
    			} else {
    				return mid;
    			}
    		}
    	}
    	return -1;
    }
}

/**
Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
*/



