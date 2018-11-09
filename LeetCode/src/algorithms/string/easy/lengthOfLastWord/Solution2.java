package algorithms.string.easy.lengthOfLastWord;

public class Solution2 {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0)
        	return 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == ' ') {
        		if(i < s.length()-1 && s.charAt(i+1) != ' ') count = 0;
        	} else {
        		count++;
        	}
        }
        return count;
    }
}
