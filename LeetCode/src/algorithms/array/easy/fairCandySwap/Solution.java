package algorithms.array.easy.fairCandySwap;

import java.util.HashSet;

public class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0, sumB = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int x : A)
        	sumA += x;
        for(int x : B) {
        	sumB += x;
        	set.add(x);
        }
        int delta = (sumB - sumA) / 2; 
        for(int x : A) {
        	if(set.contains(delta + x))
        		return new int[] {x, delta+x};
        }
        return null;
    }
}
