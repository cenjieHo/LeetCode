package algorithms.NAC.majorityElementII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
    	List<Integer> res = new ArrayList<>();
    	if(nums == null || nums.length == 0)
    		return res;
    	int num1 = nums[0];
    	int num2 = nums[0];
    	int c1 = 0;
    	int c2 = 0;
    	for(int i = 0; i < nums.length; i++) {
    		if(nums[i] == num1) {
    			c1++;
    		} else if(nums[i] == num2) {
    			c2++;
    		} else if(c1 == 0) {
    			num1 = nums[i];
    			c1 = 1;
    		} else if(c2 == 0) {
    			num2 = nums[i];
    			c2 = 1;
    		} else {
    			c1--;
    			c2--;
    		}
    	}
    	c1 = 0;
    	c2 = 0;
    	for(int i = 0; i < nums.length; i++) {
    		if(nums[i] == num1) {
    			c1++;
    		} else if(nums[i] == num2) {
    			c2++;
    		}
    	}
    	if(c1 > nums.length / 3) res.add(num1);
    	if(c2 > nums.length / 3) res.add(num2);
    	return res;
    }
}
