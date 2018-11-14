package algorithms.dynamicProgramming.easy.climbingStairs;

public class Solution {
    public int climbStairs(int n) {
    	if(n == 1) return 1;
    	int first = 1;
    	int second = 2;
    	for(int i = 3; i <= n; i++) {
    		int third = first + second;
    		first = second;
    		second = third;
    	}
    	return second;
    }
}

/**
初始状态：
f(1) = 1
f(2) = 2
f(3) = 3

状态转移方程：
f(n) = f(n-2) + f(n-1)
*/