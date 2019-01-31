package algorithms.NAC.numberComplement;

public class Solution {
    public int findComplement(int num) {
        int h = change(num);
        return h ^ num;
    }
    
    private int change(int n) {
    	n = n | (n >>> 1);
    	n = n | (n >>> 2);
    	n = n | (n >>> 4);
    	n = n | (n >>> 8);
    	n = n | (n >>> 16);
    	return n;
    }
}
