package algorithms.hashtable.easy.SetMismatch;

public class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] map = new int[nums.length+1];
        int[] res = new int[2];
        int dup = 0;
        int loss = 0;
        int sumA = 0;
        for(int i = 0; i < nums.length; i++) {
        	map[nums[i]]++;
        	if(map[nums[i]] > 1) dup = nums[i];
        	sumA += nums[i];
        }
        int sumB = sumA - dup;
        loss = (1 + nums.length) * nums.length / 2 - sumB;
        res[0] = dup;
        res[1] = loss;
        return res;
    }
}