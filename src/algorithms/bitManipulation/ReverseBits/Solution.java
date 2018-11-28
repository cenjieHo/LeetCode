package algorithms.bitManipulation.ReverseBits;

public class Solution {
    public int reverseBits(int n) {
        if (n == 0) return 0;
        
        int res = 0;
        for (int i = 0; i < 32; i++) {
        	res = res << 1;
            if ((n & 1) == 1) res++;
            n = n >> 1;
        }
        return res;
    }
}
