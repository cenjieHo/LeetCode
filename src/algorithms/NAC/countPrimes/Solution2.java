package algorithms.NAC.countPrimes;

public class Solution2 {
    public int countPrimes(int n) {
    	int res = 0;
    	boolean[] notPrime = new boolean[n];
        for(int i = 2; i < n; i++) {
        	if(!notPrime[i]) {
        		res++;
        		for(int j = 2; i * j < n; j++) {
        			notPrime[i * j] = true;
        		}
        	}
        }
        return res;
    }
}
