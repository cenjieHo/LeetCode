package algorithms.string.addBinary;

public class Solution {
    public String addBinary(String a, String b) {
    	int num1 = Integer.valueOf(a, 2), num2 = Integer.valueOf(b, 2);
    	int sum = 0, carry = 0;
    	do {
    		sum = num1 ^ num2;
    		carry = (num1 & num2) << 1;
    		num1 = sum;
    		num2 = carry;
    	} while(carry != 0);
    	return Integer.toBinaryString(sum);
    }
}
