package algorithms.NAC.sqrtx;

public class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        long n = 1;
        while(n * n < x) {
        	n++;
        }
        return (int) (n * n == x ? n : n-1);
    }
}

/**
Example 1:

Input: 4
Output: 2
Example 2:

Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since 
             the decimal part is truncated, 2 is returned.
*/