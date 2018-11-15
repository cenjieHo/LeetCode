package algorithms.dynamicProgramming.rangeSumQuery;

public class NumArray {
	int[] memo;
	
    public NumArray(int[] nums) {
    	if(nums.length == 0) return;
        memo = new int[nums.length];
        memo[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
        	memo[i] = nums[i] + memo[i-1];
        }
    }
    
    public int sumRange(int i, int j) {
    	if(i == 0) return memo[j];
    	else return memo[j] - memo[i-1];
    }
}
