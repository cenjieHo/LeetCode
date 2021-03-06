package algorithms.array.sortArrayByParity;

public class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length-1;
        while(i < j) {
        	if(A[i] % 2 != 0 && A[j] % 2 == 0) {
        		int temp = A[i];
        		A[i] = A[j];
        		A[j] = temp;
        	}
        	
        	if(A[i] % 2 == 0) i++;
        	if(A[j] % 2 != 0) j--;
        }
        return A;
    }
}
