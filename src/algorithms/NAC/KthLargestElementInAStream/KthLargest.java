package algorithms.NAC.KthLargestElementInAStream;

import java.util.PriorityQueue;

public class KthLargest {
	PriorityQueue<Integer> queue;
	int k;
	
    public KthLargest(int k, int[] nums) {
        queue = new PriorityQueue<>(k);
        this.k = k;
        
        if(nums.length <= k) {
        	for(int num : nums) queue.add(num);
        } else {
        	for(int i = 0; i < k; i++) queue.add(nums[i]);
        	for(int i = k; i < nums.length; i++) add(nums[i]);
        }
    }
    
    public int add(int val) {
    	if(queue.isEmpty()) {
    		queue.add(val);
    		return val;
    	}
        if(queue.size() == k) {
        	if(val > queue.peek()) {
        		queue.poll();
        		queue.add(val);
        	}
        } else {
        	queue.add(val);
        }
        return queue.peek();
    }
}
