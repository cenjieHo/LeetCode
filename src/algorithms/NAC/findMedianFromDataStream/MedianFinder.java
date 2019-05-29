package algorithms.NAC.findMedianFromDataStream;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {
	private PriorityQueue<Integer> minHeap;
	private PriorityQueue<Integer> maxHeap;
	
	
    /** initialize your data structure here. */
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
        });
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty() || num < maxHeap.peek()) {
        	maxHeap.offer(num);
        	if(maxHeap.size() - minHeap.size() > 1) minHeap.offer(maxHeap.poll());
        } else {
        	minHeap.offer(num);
        	if(maxHeap.size() < minHeap.size()) maxHeap.offer(minHeap.poll());
        }
        
    }
    
    public double findMedian() {
        int count = minHeap.size() + maxHeap.size();
        if(count == 0)
        	return 0;
        if(count % 2 == 0) {
        	return (minHeap.peek() + maxHeap.peek()) / 2.0;
        } else {
        	return maxHeap.peek();
        }
    }
}
