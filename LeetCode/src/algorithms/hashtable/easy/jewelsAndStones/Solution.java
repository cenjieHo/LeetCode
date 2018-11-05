package algorithms.hashtable.easy.jewelsAndStones;

public class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] map = new char[256];
        int count = 0;
        for(int i = 0; i < J.length(); i++) {
        	map[J.charAt(i)]++;
        }
        for(int i = 0; i < S.length(); i++) {
        	if(map[S.charAt(i)] > 0) {
        		count++;	
        	}
        }
        return count;
    }
}
