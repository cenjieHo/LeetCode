package algorithms.hashtable.easy.validAnagram;

public class Solution3 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        	return false;
        char[] chars = new char[26];
        
        for(int i = 0; i < s.length(); i++) {
        	chars[s.charAt(i) - 'a']++;
        	chars[t.charAt(i) - 'a']--;
        }
        for(int n : chars)
        	if(n != 0) return false;
        return true;
    }
}
