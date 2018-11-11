package algorithms.string.easy.countBinarySubstrings;

public class Solution {
    public int countBinarySubstrings(String s) {
    	int res = 0;
    	char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length - 1; i++) {
        	char c = chars[i];
        	int index = i+1;
        	int cnt = 1;
        	while(index < chars.length && chars[index] == c) {
        		cnt++;
        		index++;
        	}
        	while(index < chars.length && chars[index] != c && cnt > 0) {
        		cnt--;
        		index++;
        	}
        	if(cnt == 0) {
        		res++;
        	}
        }
        return res;
    }
}
