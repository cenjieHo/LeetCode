package algorithms.array.findTheDuplicateNumber;

public class Solution {
    public int findDuplicate(int[] nums) {
        if(nums == null || nums.length <= 1)
        	return -1;
        int lo = 1;
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
        		lo = mid+1;
        	}
        }
        return hi;
    }
}
