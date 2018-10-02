package algorithms.array.easy.searchInsertPosition;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int hi = nums.length-1;
        int lo = 0;
        int middle = lo + (hi - lo) / 2;
        while(lo < hi) {
        	if(target < nums[middle]) {
        		hi = middle;
        	} 
        	else if(target > nums[middle]) {
        		lo = middle + 1;
        	} 
        	else {
        		return middle;
        	}
    		middle = lo + (hi - lo) / 2;
        }
        
        return target > nums[nums.length-1] ? middle+1 : middle;
    }
}