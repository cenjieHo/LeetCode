package algorithms.array.arrayPartitionI;

import java.util.Arrays;

public class Solution {
    public int arrayPairSum(int[] nums) {
    	int sum = 0;	
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1;) {
        	sum += nums[i];
        	i += 2;
        }
        return sum;
    }
}
