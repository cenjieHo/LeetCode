package algorithms.array.flippingAnImage;

public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int[] a : A) {
        	int lo = 0;
        	int hi = a.length-1;
        	while(lo < hi) {
        		int temp = a[lo];
        		a[lo] = a[hi];
        		a[hi] = temp;
        		a[lo] = 1 - a[lo];
        		a[hi] = 1 - a[hi];   	
        		lo++;
        		hi--;
        	}
        	if(lo == hi) {
        		a[hi] = 1 - a[hi];
        	}
        }
        return A;
    }
}
