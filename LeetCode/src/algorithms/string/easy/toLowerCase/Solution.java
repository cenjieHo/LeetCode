package algorithms.string.easy.toLowerCase;

public class Solution {
    public String toLowerCase(String str) {
    	char[] chars = str.toCharArray();
        for(int i = 0; i < str.length(); i++) {
        	if(chars[i] >= 'A' && chars[i] <= 'Z') {
        		chars[i] += 32;
        	}
        }
        return new String(chars);
    }
}
