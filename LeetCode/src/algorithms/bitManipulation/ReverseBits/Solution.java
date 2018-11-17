package algorithms.bitManipulation.ReverseBits;

public class Solution {
    public int reverseBits(int n) {
        int[] binary = toReverseBinary(n);
        int res = toDecimal(binary);
        return res;
    }
    
    public int[] toReverseBinary(int n) {
    	int[] binary = new int[32];
    	int index = 0;
    	for(int i = n; i >= 1; i /= 2) {
    		if(i % 2 == 0) {
    			binary[index++] = 0;
    		} else {
    			binary[index++] = 1;
    		}
    	}
    	return binary;
    }
    
    public int toDecimal(int[] binary) {
        long sum = 0;
    	int index = 0;
    	for(int i = binary.length-1; i >= 0; i--) {
    		sum += binary[i] * Math.pow(2, index++);
    	}
    	return (int)sum;
    }
}
