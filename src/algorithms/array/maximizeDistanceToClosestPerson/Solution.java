package algorithms.array.maximizeDistanceToClosestPerson;

public class Solution {
    public int maxDistToClosest(int[] seats) {
        int last = -1;
        int max = Integer.MIN_VALUE;
        int i = 0;
        for(; i < seats.length; i++) {
        	if(seats[i] == 1) {
        		if(last == -1) {
	        		max = i == 0 ? max : i;
        		} else {
        			int seat = (last + i)/2;
        			int distance = Math.min(i-seat, seat-last);
        			if(max < distance){
        				max = distance;
        			}
        		}
        		last = i;
        	}
        }
        if(seats[i-1] == 0)
			max = Math.max(i-1-last, max);
        return max;
    }
}
