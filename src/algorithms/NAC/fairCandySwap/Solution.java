package algorithms.NAC.fairCandySwap;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
    	int sumA = 0;
    	int sumB = 0;
    	Set<Integer> set = new HashSet<>();
    	for(int n : A) {
    		sumA += n;
    	}
    	for(int n : B) {
    		sumB += n;
    		set.add(n);
    	}
    	int delta = (sumB - sumA) / 2;
    	for(int n : A) {
    		if(set.contains(delta + n))
    			return new int[] {n, delta + n};
    	}
    	return null;
    }
}

/**
111  dd111
*/