package algorithms.NAC.sqrtx;

public class Solution2 {
    public int mySqrt(int x) {
    	long left = 0;
    	long right = x;
    	while(left <= right) {
    		long mid = left + (right - left) / 2;
    		if(mid * mid < x) {
    			left = mid + 1;
    		} else if(mid * mid > x) {
    			right = mid - 1;
    		} else {
    			return (int) mid;
    		}
    	}
    	return (int) right;
    }
}
