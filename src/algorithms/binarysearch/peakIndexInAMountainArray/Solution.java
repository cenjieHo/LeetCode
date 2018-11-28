package algorithms.binarysearch.peakIndexInAMountainArray;

public class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int lo = 0;
        int hi = A.length-1;
        int middle = lo + (hi - lo) / 2;
        while(lo <= hi) {
        	if((middle - 1 < 0 || A[middle] > A[middle-1]) && (middle + 1 == A.length || A[middle] < A[middle+1])) {
        		lo = middle + 1;
        	} else if((middle - 1 < 0 ||A[middle] < A[middle-1]) && (middle + 1 == A.length || A[middle] > A[middle+1])) {
        		hi = middle - 1;
        	} else {
        		return middle;
        	}
        	middle = lo + (hi - lo) / 2;
        }
        return middle == A.length ? A.length-1 : middle;
    }
}

