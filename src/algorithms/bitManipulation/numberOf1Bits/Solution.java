package algorithms.bitManipulation.numberOf1Bits;

public class Solution {
    public int hammingWeight(int n) {
        int cnt = 0;
        int compare = 1;
        for(int i = 0; i < 32; i++) {
        	if((n & compare) != 0) {
        		cnt++;
        	}
        	compare = compare << 1;
        }
        return cnt;
    }
}
