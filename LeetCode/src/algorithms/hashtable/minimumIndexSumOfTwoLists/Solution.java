package algorithms.hashtable.minimumIndexSumOfTwoLists;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        int sum = Integer.MAX_VALUE;
        for(int i = 0; i < list1.length; i++) {
        	map.put(list1[i], i);
        }
        for(int i = 0; i < list2.length; i++) {
        	if(map.containsKey(list2[i]) && i + map.get(list2[i]) < sum) {
        		sum = i + map.get(list2[i]);
        	}
        }
        for(int i = 0; i < list2.length; i++) {
        	if(map.containsKey(list2[i]) && i + map.get(list2[i]) == sum) {
        		list.add(list2[i]);
        	}
        }
        return list.toArray(new String[list.size()]);
    }
}

