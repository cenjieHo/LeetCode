package algorithms.string.easy.stringCompression;

public class Solution {
    public int compress(char[] chars) {
        int oldIdx = 0, newIdx = 0;
        while(newIdx < chars.length) {
        	int count = 0;
        	char curr = chars[newIdx];
        	while(newIdx < chars.length && curr == chars[newIdx]) {
        		count++;
        		newIdx++;
        	}
        	chars[oldIdx++] = curr;
        	if(count != 1) {
        		for(char c : Integer.toString(count).toCharArray()) {
        			chars[oldIdx++] = c;
        		}
        	}
        }
        return newIdx;
    }
}
