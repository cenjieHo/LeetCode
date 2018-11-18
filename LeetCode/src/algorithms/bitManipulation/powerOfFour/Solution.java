package algorithms.bitManipulation.powerOfFour;

public class Solution {
    public boolean isPowerOfFour(int n) {
    	if(n < 4) return n == 1;
    	int cnt = 0;
    	int compare = 1;
    	for(int i = 0; i < 31; i++) {
    		if((n & compare) != 0) {
    			if(i % 2 == 0) cnt++;
    			else return false;
    		}
    		compare = compare << 1;
    	}
    	return cnt == 1 ? true : false;
    }
}