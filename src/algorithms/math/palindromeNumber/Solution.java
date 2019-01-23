package algorithms.math.palindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
    	if(x == 0) return true;
    	if(x < 0) return false;
    	int len = countLen(x);
    	int o = x;
    	long n = 0;
    	while(len != 0) {
    		int num = x % 10;
    		n += num * Math.pow(10, len-1);
    		len--;
    		x /= 10;
    	}
    	return o == n;
    }
    
    private int countLen(int x) {
    	int len = 0;
    	while(x != 0) {
    		x /= 10;
    		len++;
    	}
    	return len;
    }
}
