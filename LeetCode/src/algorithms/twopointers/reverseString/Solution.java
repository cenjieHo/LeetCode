package algorithms.twopointers.reverseString;

public class Solution {
    public String reverseString(String s) {
    	StringBuilder str = new StringBuilder();
//    	char[] newStr = new char[s.length()];
        for(int i = s.length()-1; i >= 0; i--) {
        	str.append(s.charAt(i));
//        	newStr[s.length()-1-i] = s.charAt(i);
        }
        return str.toString();
    }
}
