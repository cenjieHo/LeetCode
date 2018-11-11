package algorithms.string.easy.rotatedDigits;

public class Solution {
    public int rotatedDigits(int N) {
    	int res = 0;
    	for(int i = 1; i <= N; i++) {
    		if(isGood(i)) {
    			res++;
    		}
    	}
    	return res;
    }
    
    private boolean isGood(int num) {
    	boolean flag = false;
    	while(num != 0) {
    		int n = num % 10;
    		if(n == 2 || n == 5 || n == 6 || n ==9) {
    			flag = true;
    		} else if(n == 3 || n == 4 || n == 7) {
    			return false;
    		}
    		num /= 10;
    	}
    	return flag;
    }
}
