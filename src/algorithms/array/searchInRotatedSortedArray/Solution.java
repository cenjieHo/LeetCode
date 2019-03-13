package algorithms.array.searchInRotatedSortedArray;

public class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;
        int lo = 0;
        int hi = nums.length-1;
        while(lo < hi) {
        	int mid = lo + (hi - lo) / 2;
        	if(nums[mid] > nums[nums.length-1]) {
        		lo = mid + 1;
        	} else {
        		hi = mid;
        	}
        }
        int rota = hi;
        int res = -1;
        if(target > nums[nums.length-1]) {
        	res = find(nums, 0, rota-1, target);
        } else {
        	res = find(nums, rota, nums.length-1, target);
        }
        return res;
    }
    
    private int find(int[] nums, int lo, int hi, int target) {
    	if(lo > hi) return -1;
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
