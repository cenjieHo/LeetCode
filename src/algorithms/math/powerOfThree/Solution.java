package algorithms.math.powerOfThree;

public class Solution {
    public boolean isPowerOfThree(int n) {
    	if(n == 1) return true;
        if(n < 3) return false;
        int t = 3;
        while(t <= n) {
        	if(t == n) return true;
        	t *= 3;
        }
        return false;
    }
}
