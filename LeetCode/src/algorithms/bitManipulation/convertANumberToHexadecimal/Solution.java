package algorithms.bitManipulation.convertANumberToHexadecimal;

public class Solution {
	char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
	
    public String toHex(int num) {
    	if(num == 0) return "0";
        int compare = 15;	// 2^16-1: 0000...001111
        String res = "";
        while(num != 0) {
        	res = map[(compare & num)] + res;
        	num = num >>> 4;
        }
        return res;
    }
}
