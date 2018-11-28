package algorithms.hashtable.intersectionOfTwoArrays;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    	HashSet<Integer> set = new HashSet<>();
    	HashMap<Integer, Integer> map = new HashMap<>();
    	
    	for(int i = 0; i < nums1.length; i++) {
    		map.put(nums1[i], 1);
    	}
    	for(int i = 0; i < nums2.length; i++) {
    		if(map.containsKey(nums2[i])) {
    			set.add(nums2[i]);
    			map.remove(nums2[i]);
    		}
    	}
    	int[] result = new int[set.size()];
    	int index = 0;
    	for(int n : set) {
    		result[index++] = n;
    	}
    	return result;
    }
}
