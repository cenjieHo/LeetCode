package algorithms.NAC.findTheDuplicateNumber;

public class Solution {
    public int findDuplicate(int[] nums) {
        if(nums == null || nums.length == 0)
        	return -1;
        int lo = 0;
        int hi = nums.length-1;
        while(lo < hi) {
        	int mid = lo + (hi - lo) / 2;
        	int cnt = 0;
        	for(int num : nums) {
        		if(num <= mid) cnt++;
        	}
        	if(cnt > mid) {
        		hi = mid;
        	} else {
        		lo = mid + 1;
        	}
        }
        return hi;
    }
}

/**
Example 1:

Input: [1,3,4,2,2]
Output: 2
Example 2:

Input: [3,1,3,4,2]
Output: 3
*/