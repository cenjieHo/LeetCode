package algorithms.NAC.letterCasePermutation;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        if(s == null || s.length() == 0)
        	return res;
        char[] sc = s.toCharArray();
        letterCasePermutationCore(sc, res, 0);
        return res;
    }
    
    private void letterCasePermutationCore(char[] sc, List<String> res, int index) {
    	if(index == sc.length) {
    		String ts = new String(sc);
    		res.add(ts);
    		return;
    	}
    	if(!Character.isDigit(sc[index])) {
    		sc[index] = Character.toLowerCase(sc[index]);
    		letterCasePermutationCore(sc, res, index+1);
    		sc[index] = Character.toUpperCase(sc[index]);
    		letterCasePermutationCore(sc, res, index+1);
   		} else {
   			letterCasePermutationCore(sc, res, index+1);
   		}
    }
}
