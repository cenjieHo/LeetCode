package algorithms.math.selfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
    	List<Integer> res = new ArrayList<>();
        for(int i = left; i <= right; i++) {
        	if(isSelf(i)) {
        		res.add(i);
        	}
        }
        return res;
    }
    
    private boolean isSelf(int num) {
    	int n = num;
    	while(n != 0) {
    		int k = n % 10;
    		if(k == 0 || num % k != 0) return false;
    		n /= 10;
    	}
    	return true;
    }
}
