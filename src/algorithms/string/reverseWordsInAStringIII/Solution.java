package algorithms.string.reverseWordsInAStringIII;

public class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int begin = 0;
        for(int i = 0; i < s.length(); i++) {
        	if(i + 1 == s.length() || chars[i+1] == ' ') {
        		reverse(chars, begin, i);
        		begin = i + 2;
        	}
        }
        return new String(chars);
    }
    
    private void reverse(char[] chars, int begin, int end) {
    	while(begin <= end) {
    		char temp = chars[begin];
    		chars[begin] = chars[end];
    		chars[end] = temp;
    		begin++;
    		end--;
    	}
    }
}
