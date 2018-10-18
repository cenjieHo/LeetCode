package algorithms.array.easy.minCostClimbingStairs;

public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int sum0 = cost[0];
        int sum1 = cost[1];
        for(int i = 2; i < cost.length; i++) {
        	int temp = sum1;
        	sum1 = cost[i] + Math.min(sum0, sum1);
        	sum0 = temp;
        }
        return Math.min(sum0, sum1);
    }
}
