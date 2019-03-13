package algorithms.array.majorityElementII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
    	List<Integer> res = new ArrayList<>();
        if(nums == null || nums.length == 0) return res;
        int n1 = nums[0];
        int n2 = nums[0];
        int c1 = 1;
        int c2 = 1;
        for(int i = 1; i < nums.length; i++) {
        	if(nums[i] == n1) {
        		c1++;
        	} else if(nums[i] == n2) {
        		c2++;
        	} else if(c1 == 0) {
        		n1 = nums[i];
        		c1 = 1;
        	} else if(c2 == 0) {
        		n2 = nums[i];
        		c2 = 1;
        	} else {
        		c1--;
        		c2--;
        	}
        }
       c1 = 0;
       c2 = 0;
       for(int i = 0; i < nums.length; i++) {
    	   if(nums[i] == n1) {
    		   c1++;
    	   } else if(nums[i] == n2) {
    		   c2++;
    	   }
       }
       if(c1 > nums.length / 3) res.add(n1);
       if(c2 > nums.length / 3) res.add(n2);
       return res;
    }
}

/**
Example 1:

Input: [3,2,3]
Output: [3]
Example 2:

Input: [1,1,1,3,3,2,2,2]
Output: [1,2]
*/