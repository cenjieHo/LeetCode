package algorithms.string.easy.uniqueMorseCodeWords;

import java.util.HashSet;

public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
        		"--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        int res = 0;
        for(String word : words) {
        	StringBuilder sb = new StringBuilder();
        	for(int i = 0; i < word.length(); i++) {
        		sb.append(morse[word.charAt(i)-'a']);
        	}
        	String str = sb.toString();
        	if(!set.contains(str)) {
        		set.add(str);
        		res++;
        	}
        }
        return res;
    }
}
