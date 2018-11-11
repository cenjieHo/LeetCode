package algorithms.string.easy.countBinarySubstrings;

public class Solution2 {
	public int countBinarySubstrings(String s) {
	    int preLen = 0, currLen = 1, res = 0;
	    for (int i=1;i<s.length();i++) {
	        if (s.charAt(i) == s.charAt(i-1)) currLen++;
	        else {
	        	preLen = currLen;
	        	currLen = 1;
	        }
	        if (preLen >= currLen) res++;
	    }
	    return res;
	}
}

/**
System.out.println(solution.countBinarySubstrings("00110011"));
System.out.println(solution.countBinarySubstrings("10101"));
System.out.println(solution.countBinarySubstrings("1"));
*/