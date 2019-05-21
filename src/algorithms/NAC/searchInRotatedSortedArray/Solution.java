package algorithms.NAC.searchInRotatedSortedArray;

public class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0)
        	return -1;
        int r = findRotate(nums);
        if(target > nums[nums.length-1]){
        	return binarySearch(nums, 0, r-1, target);
        } else {
        	return binarySearch(nums, r, nums.length-1, target);
        }
    }
    
    private int binarySearch(int[] nums, int lo, int hi, int target) {
    	while(lo <= hi) {
    		int mid = lo + (hi - lo) / 2;
    		if(nums[mid] > target) {
    			hi = mid - 1;
    		} else if(nums[mid] < target) {
    			lo = mid + 1;
    		} else {
    			return mid;
    		}
    	}
    	return -1;
    }
    
    private int findRotate(int[] nums) {
    	int lo = 0;
    	int hi = nums.length-1;
    	int comp = nums[nums.length-1];
    	while(lo < hi) {
    		int mid = lo + (hi - lo) / 2;
    		if(nums[mid] < comp) {
    			hi = mid;
    		} else {
    			lo = mid + 1;
    		}
    	}
    	return lo;
    }
}
