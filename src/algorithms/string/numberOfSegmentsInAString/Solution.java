package algorithms.string.numberOfSegmentsInAString;

public class Solution {
    public int countSegments(String s) {
    	if(s.length() == 0)
    		return 0;
    	String[] spl = s.split(" ");
        return spl.length;
    }
}

/**
, , , , a, eaefa
**/