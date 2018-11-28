package algorithms.string.repeatedStringMatch;

public class Solution {
    public int repeatedStringMatch(String A, String B) {
    	StringBuilder sb = new StringBuilder(A);
    	int count = 1;
    	while(sb.length() < B.length()) {
    		sb.append(A);
    		count++;
    	}
    	if(sb.toString().contains(B)) return count;
    	if(sb.append(A).toString().contains(B)) return count+1;
    	return -1;
    }
}