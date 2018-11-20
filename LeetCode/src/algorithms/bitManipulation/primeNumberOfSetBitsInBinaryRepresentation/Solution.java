package algorithms.bitManipulation.primeNumberOfSetBitsInBinaryRepresentation;

public class Solution {
    public int countPrimeSetBits(int L, int R) {
    	int cnt = 0;
        for(int i = L; i <= R; i++) {
        	if(isPrime(count(i))) cnt++;
        }
        return cnt;
    }
    
    private int count(int num) {
    	int cnt = 0;
    	while(num != 0) {
    		if((num & 1) == 1) cnt++;
    		num = num >>> 1;
    	}
    	return cnt;
    }
    
    private boolean isPrime(int num) {
    	if(num == 0 || num == 1) 
    		return false;
    	for(int i = 2; i <= Math.sqrt(num); i++) {
    		if(num % i == 0) return false;
    	}
    	return true;
    }
}
