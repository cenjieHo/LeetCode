package algorithms.binarysearch.validPerfectSquare;

public class Solution {
    public boolean isPerfectSquare(int num) {
        long lo = 1;
        long hi = num;
        long middle = lo + (hi - lo) / 2;
        while(lo <= hi) {
        	long pow = middle * middle;
        	if(pow < num) {
        		lo = middle + 1;
        	} else if(pow > num) {
        		hi = middle - 1;
        	} else {
        		return true;
        	}
        	middle = lo + (hi - lo) / 2;
        }
        return false;
    }
}
