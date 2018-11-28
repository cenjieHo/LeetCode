package algorithms.heap.kthLargestElementInAStream;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargest {
	private Queue<Integer> heap;
	private int k;
	
    public KthLargest(int k, int[] nums) {
    	heap = new PriorityQueue<>(k);
    	this.k = k;
    	for(int num : nums)
    		add(num);
    }
    
    public int add(int val) {
    	if(heap.size() < k) {
    		heap.add(val);
    	} else if(val > heap.peek()) {
    		heap.poll();
    		heap.add(val);
    	}
    	return heap.peek();
    }
}
