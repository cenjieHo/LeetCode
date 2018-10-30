package algorithms.hashtable.easy.findTheDifference;

public class Solution {
    public char findTheDifference(String s, String t) {
    	int sumS = 0, sumT = 0;
        for(int i = 0; i < s.length(); i++) {
        	sumS += s.charAt(i);
        }
        for(int i = 0; i < t.length(); i++) {
        	sumT += t.charAt(i);
        }
        int diff = Math.abs(sumT - sumS);
        return (char) diff;
    }
}
