package algorithms.string.romanToInteger;

public class Solution {
    public int romanToInt(String s) {
        int[] roman = new int[26];
        roman['I'-'A'] = 1;roman['V'-'A'] = 5;roman['X'-'A'] = 10;roman['L'-'A'] = 50;
        roman['C'-'A'] = 100;roman['D'-'A'] = 500;roman['M'-'A'] = 1000;
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
        	char curr = s.charAt(i);
        	if(curr == 'I') {
        		if(i < s.length() - 1 && s.charAt(i+1) == 'V') {
        			result += roman['V'-'A'] - roman[curr-'A'];
        			i++;
        		} else if(i < s.length() - 1 && s.charAt(i+1) == 'X') {
        			result += roman['X'-'A'] - roman[curr-'A'];
        			i++;
        		} else {
        			result += roman[curr-'A'];
        		}
        	} else if(curr == 'X') {
           		if(i < s.length() - 1 && s.charAt(i+1) == 'L') {
        			result += roman['L'-'A'] - roman[curr-'A'];
        			i++;
        		} else if(i < s.length() - 1 && s.charAt(i+1) == 'C') {
        			result += roman['C'-'A'] - roman[curr-'A'];
        			i++;
        		} else {
        			result += roman[curr-'A'];
        		}
        	} else if(curr == 'C') {
           		if(i < s.length() - 1 && s.charAt(i+1) == 'D') {
        			result += roman['D'-'A'] - roman[curr-'A'];
        			i++;
        		} else if(i < s.length() - 1 && s.charAt(i+1) == 'M') {
        			result += roman['M'-'A'] - roman[curr-'A'];
        			i++;
        		} else {
        			result += roman[curr-'A'];
        		}
        	} else {
        		result += roman[curr-'A'];
        	}
        }
        return result;
    }
}
