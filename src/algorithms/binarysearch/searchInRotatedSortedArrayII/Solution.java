package algorithms.binarysearch.searchInRotatedSortedArrayII;

public class Solution {
    public boolean search(int[] nums, int target) {
        if(nums == null || nums.length == 0)
        	return false;
        if(nums.length == 1)
        	return nums[0] == target;
        int lo = 0;
        int hi = nums.length-1;
        while(lo < hi) {
        	int mid = lo + (hi - lo) / 2;
        	if(nums[mid] > nums[nums.length-1]) {
        		lo = mid + 1;
        	} else if(nums[mid] < nums[nums.length-1]){
        		hi = mid;
        	} else {
        		for(int i = 0; i < nums.length; i++)
        			if(nums[i] == target) return true;
        		return false;
        	}
        }
        int rota = hi;
        int res = -1;
        if(target < nums[nums.length-1]) {
        	res = find(nums, rota, nums.length-1, target);
        } else if(target > nums[nums.length - 1]){
        	res = find(nums, 0, rota-1, target);
        } else {
        	return true;
        }
        return res != -1;
    }
    
    private int find(int[] nums, int lo, int hi, int target) {
    	if(lo > hi) 
    		return -1;
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
}

/*
5 6 7 1 2 3 4
*/