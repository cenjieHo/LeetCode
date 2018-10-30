package algorithms.hashtable.easy.distributeCandies;

import java.util.HashMap;

public class Solution {
    public int distributeCandies(int[] candies) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < candies.length; i++) {
        	map.put(candies[i], 1);
        }
        return map.size() > candies.length/2 ? candies.length/2 : map.size();
    }
}
