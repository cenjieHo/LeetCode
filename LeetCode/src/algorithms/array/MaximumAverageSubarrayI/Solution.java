package algorithms.array.MaximumAverageSubarrayI;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        while(i + k - 1 < nums.length) {
        	int curr = 0;
        	int j = i;
        	int cnt = k;
        	while(cnt-- > 0) {
        		curr += nums[j];
        		j++;
        	}
        	if(curr > max)
        		max = curr;
        	i++;
        }
        return (double)max / k;
    }
}
