package algorithms.array.easy.MaximumAverageSubarrayI;

public class Solution2 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
        	sum += nums[i];
        }
        int max = sum;
        for(int i = k; i < nums.length; i++) {
        	sum += nums[i] - nums[i-k];
        	if(sum > max)
        		max = sum;
        }
        return (double)max / k;
    }
}
