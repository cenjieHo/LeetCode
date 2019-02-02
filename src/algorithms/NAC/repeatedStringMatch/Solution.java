package algorithms.NAC.repeatedStringMatch;

public class Solution {
    public int repeatedStringMatch(String A, String B) {
        StringBuilder copy = new StringBuilder();
        int times = 0;
        while(copy.length() <= B.length() + A.length()) {
        	copy.append(A);
        	times++;
        	if(copy.indexOf(B) >= 0) return times;
        }
        return -1;
    }
}
