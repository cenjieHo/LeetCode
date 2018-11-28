package algorithms.string.buddyStrings;

import java.util.HashSet;

public class Solution {
    public boolean buddyStrings(String A, String B) {
        if(A.length() != B.length())
        	return false;
        HashSet<Character> set = new HashSet<>();
        char[] diffA = new char[2];
        char[] diffB = new char[2];
        int index = 0;
        for(int i = 0; i < A.length(); i++) {
        	set.add(A.charAt(i));
        	if(A.charAt(i) != B.charAt(i)){
        		if(index == 2) return false;
        		diffA[index] = A.charAt(i);
        		diffB[index] = B.charAt(i);
        		index++;
        	}
        }
        
        if(index == 2) {
        	return (diffA[0] != 0 && diffA[1] != 0 && diffA[0] == diffB[1] && diffB[0] == diffA[1]);
        } else if(index == 1) {
        	return false;
        } else {
        	return (A.equals(B) && set.size() < A.length());
        }
    }
}

/*
String a1 = "abc";
String b1 = "abc";
String a2 = "abbbbc";
String b2 = "cbbbba";
String a3 = "abcd";
String b3 = "abc";
String a4 = "";
String b4 = "";
String a5 = "aaaaaaabc";
String b5 = "aaaaaaabc";
*/