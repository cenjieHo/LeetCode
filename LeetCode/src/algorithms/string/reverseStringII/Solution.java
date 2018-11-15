package algorithms.string.reverseStringII;

public class Solution {
    public String reverseStr(String s, int k) {
    	if(k == 1 || s.length() <= 1) return s;
    	char[] chars = s.toCharArray();
    	for(int i = 0; i < s.length(); i+=2*k) {
    		if(i + k <= s.length()) {
    			//ʣ����ڵ���k
    			reverse(chars, i, i + k - 1);
    		} else {
    			//ʣ��С��k,��תȫ��
    			reverse(chars, i, s.length()-1);
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

/**
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
*/
