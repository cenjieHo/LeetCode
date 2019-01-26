package algorithms.NAC.longestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
    	StringBuilder res = new StringBuilder();
    	if(strs == null || strs.length == 0) return res.toString();
    	for(int i = 0; ;i++) {
    		if(i >= strs[0].length()) return res.toString();
    		char ch = strs[0].charAt(i);
    		for(int j = 1; j < strs.length; j++) {
    			if(i >= strs[j].length() || strs[j].charAt(i) != ch) return res.toString();
    		}
    		res.append(ch);
    	}
    }
}

/**
Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/