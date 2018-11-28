package algorithms.bitManipulation.hammingDistance;

public class Solution {
    public int hammingDistance(int x, int y) {
        int compare = 1;
        int cnt = 0;
        for(int i = 0; i < 31; i++) {
        	if((x & compare) != (y & compare)) {
        		cnt++;
        	}
        	compare = compare << 1;
        }
        return cnt;
    }
}
