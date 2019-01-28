package algorithms.NAC.reverseBits;

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if(n == 0)
        	return 0;
        int res = 0;
        for(int i = 0; i < 32; i++) {
        	if((n & 1) == 1) res++;
        	res = res << 1;
        	n = n >> 1;
        }
        return res;
    }
}

/**
Input: 00000010100101000001111010011100
Output: 00111001011110000010100101000000
*/