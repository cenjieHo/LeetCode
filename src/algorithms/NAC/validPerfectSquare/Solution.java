package algorithms.NAC.validPerfectSquare;

public class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 0;
        int r = num;
        while(l <= r) {
        	long m = l + (r - l) / 2;
        	if(m * m < num) {
        		l = (int) (m + 1);
        	} else if(m * m > num) {
        		r = (int) (m - 1);
        	} else {
        		return true;
        	}
        }
        return false;
    }
}
