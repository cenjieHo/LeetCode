package algorithms.NAC.stringCompression;

public class Solution {
    public int compress(char[] chars) {
    	if(chars == null || chars.length == 0) return 0;
    	int i = 0;
    	int j = 1;
    	int count = 1;
    	while(j <= chars.length-1) {
    		if(chars[j] == chars[i]) {
    			count++;
    			j++;
    		} else {
    			if(count > 1) {
	    			String str = String.valueOf(count);
	    			for(int t = 0; t < str.length(); t++) {
	    				chars[++i] = str.charAt(t);
	    			}
    			}
    			chars[++i] = chars[j];
    			j++;
    			count = 1;
    		}
    	}
    	if(count > 1) {
			String str = String.valueOf(count);
			for(int t = 0; t < str.length(); t++) {
				chars[++i] = str.charAt(t);
			}
			i++;
    	} else if(count == 1) {
    		i++;
    	}
    	return i;
    }
    
}
