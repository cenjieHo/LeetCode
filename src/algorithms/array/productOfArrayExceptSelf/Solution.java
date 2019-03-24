package algorithms.array.productOfArrayExceptSelf;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
    	int[] res = new int[nums.length];
        if(nums == null || nums.length <= 0) 
        	return res;
        int product = 1;
        int zero = 0;
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] == 0) {
        		zero++;
        		continue;
        	}
        	product *= nums[i];
        }
        if(zero == 0) {
        	for(int i = 0; i < nums.length; i++) {
        		res[i] = product / nums[i];
        	}
        } else if(zero == 1) {
        	for(int i = 0; i < nums.length; i++) {
        		if(nums[i] == 0) {
        			res[i] = product;
        			break;
        		}
        	}
        }
        return res;
    }
}
