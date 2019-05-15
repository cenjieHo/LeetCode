package algorithms.stack.topKFrequentElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
        	int val = count.getOrDefault(nums[i], 0);
        	count.put(nums[i], ++val);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2)->count.get(n1)-count.get(n2));
        for(int n : count.keySet()) {
        	heap.add(n);
        	if(heap.size() > k)
        		heap.poll();
        }
        List<Integer> res = new ArrayList<>(k+1);
        while(!heap.isEmpty()) {
        	res.add(heap.poll());
        }
        return res;
    }
}
