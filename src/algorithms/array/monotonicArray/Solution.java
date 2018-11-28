package algorithms.array.monotonicArray;

public class Solution {
    public boolean isMonotonic(int[] A) {
    	if(A.length == 1)
    		return true;
    	int index = 1;
    	while(index < A.length && A[index] == A[index-1]) index++;
    	if(index == A.length) return true;
    	int ca = A[index] - A[index-1];
    	for(int i = index+1; i < A.length; i++) {
    		if(ca >= 0) {
    			if(A[i] - A[i-1] < 0) return false;
    		} else {
    			if(A[i] - A[i-1] > 0) return false;
    		}
    	}
    	return true;
    }
}
