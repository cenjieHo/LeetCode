package algorithms.bitManipulation.powerOfTwo;

public class Solution {
    public boolean isPowerOfTwo(int n) {
    	if(n <= 0) return false;
        int cnt = 0;
        int compare = 1;
        for(int i = 0; i < 31; i++) {
        	if((n & compare) != 0) {
        		cnt++;
        	}
        	if(cnt > 1) break;
        	compare = compare << 1;
        }
        return cnt == 1 ? true : false;
    }
}
