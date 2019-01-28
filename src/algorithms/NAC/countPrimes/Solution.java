package algorithms.NAC.countPrimes;

public class Solution {
    public int countPrimes(int n) {
    	int res = 0;
    	for(int i = 2; i < n; i ++) {
    		if(isPrime(i)) res++;
    	}
    	return res;
    }
    
    private boolean isPrime(int n) {
    	for(int i = 2; i <= Math.sqrt(n); i++) {
    		if(n % i == 0) return false;
    	}
    	return true;
    }
}
