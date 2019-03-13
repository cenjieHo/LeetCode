package algorithms.array.summaryRanges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
    	List<String> res = new ArrayList<>();
    	if(nums == null || nums.length == 0) return res;
        int lo = 0;
        int hi = 0;
        for(int i = 1; i < nums.length; i++) {
        	if(nums[i] == nums[i-1] + 1) {
        		hi++;
        	} else {
        		String range = "";
        		if(lo == hi) range += nums[lo];
        		else range = nums[lo] + "->" + nums[hi];
        		res.add(range);
        		lo = i;
        		hi = i;
        	}
        }
		String range = "";
		if(lo == hi) range += nums[lo];
		else range = nums[lo] + "->" + nums[hi];
		res.add(range);
        return res;
    }
}


/**
Example 1:

Input:  [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: 0,1,2 form a continuous range; 4,5 form a continuous range.
Example 2:

Input:  [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: 2,3,4 form a continuous range; 8,9 form a continuous range.
*/