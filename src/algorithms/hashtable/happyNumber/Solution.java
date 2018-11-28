package algorithms.hashtable.happyNumber;

import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n) {
    	HashSet<Integer> set = new HashSet<>();
        do {
        	if(!set.add(n)) return false;
        	int sum = 0;
        	while(n != 0) {
        		sum = (int) (sum + Math.pow(n % 10, 2));
        		n = n / 10;
        	}
        	n = sum;
        } while(n != 1);
        return true;
    }
}
