package algorithms.NAC.addBinary;

public class Solution {
    public String addBinary(String a, String b) {
    	String res = "";
    	int carry = 0;
    	int i = a.length()-1;
    	int j = b.length()-1;
    	while(i >= 0 || j >= 0) {
    		int v1 = i >= 0 ? a.charAt(i) - '0' : 0;
    		int v2 = j >= 0 ? b.charAt(j) - '0' : 0;
    		int sum = (carry + v1 + v2) % 2;
    		res = sum + res;
    		carry = (carry + v1 + v2) / 2;
    		i--;
    		j--;
    	}
    	if(carry != 0) {
    		res = carry + res;
    	}
    	return res;
    }
}
