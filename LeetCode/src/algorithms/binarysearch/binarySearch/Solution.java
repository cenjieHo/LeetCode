package algorithms.binarysearch.binarySearch;

public class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length-1;
        int middle = lo + (hi - lo) / 2;
        while(lo <= hi) {
        	if(nums[middle] > target) {
        		hi = middle - 1;
        	} else if(nums[middle] < target) {
        		lo = middle + 1;
        	} else {
        		return middle;
        	}
        	middle = lo + (hi - lo) / 2;
        }
        return -1;
    }
}
