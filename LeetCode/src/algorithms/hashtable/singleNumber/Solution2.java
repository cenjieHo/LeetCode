package algorithms.hashtable.singleNumber;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int singleNumber(int[] nums) {
    	int a = 0;
    	for(int num : nums)
    		a ^= num;
    	return a;
    }
}
