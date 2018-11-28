package algorithms.array.plusOne;

public class Solution {
    public int[] plusOne(int[] digits) {
    	int n = digits.length - 1;
    	
    	digits[n]++;
    	for(int i = n-1; i >= 0; i--) {
    		if(digits[i+1] == 10) {
    			digits[i+1] = 0;
    			digits[i]++;
    		}
    	}
    	
    	if(digits[0] == 10) {
    		int[] arr = new int[digits.length+1];
    		digits[0] = 0;
    		arr[0] = 1;
    		for(int i = 0; i < digits.length; i++) {
    			arr[i+1] = digits[i];
    		}
    		return arr;
    	}
        return digits;
    }
}
