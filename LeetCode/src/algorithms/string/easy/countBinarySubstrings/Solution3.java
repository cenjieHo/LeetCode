package algorithms.string.easy.countBinarySubstrings;

public class Solution3 {
    public int countBinarySubstrings(String s) {
    	int[] groups = new int[s.length()];
    	char[] chars = s.toCharArray();
    	groups[0] = 1;
    	int index = 0;
    	int res = 0;
    	for(int i = 1; i < chars.length; i++) {
    		if(chars[i] == chars[i-1]) {
    			groups[index]++;
    		} else {
    			groups[++index]++;
    		}
    	}
    	for(int i = 1; i < groups.length; i++) {
    		res += Math.min(groups[i], groups[i-1]);
    	}
    	return res;
    }
}

/**
System.out.println(solution.countBinarySubstrings("001110011")); 2 3 2 2
System.out.println(solution.countBinarySubstrings("10101"));
System.out.println(solution.countBinarySubstrings("1"));
*/