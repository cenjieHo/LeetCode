package algorithms.string.easy.validPalindromeII;

public class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
        	if(s.charAt(i) != s.charAt(j)) 
        		return isPalindrome(s, i+1, j) || isPalindrome(s, i, j-1);
        	i++;
        	j--;
        }
        return true;
    }
    
    private boolean isPalindrome(String s, int i, int j) {
    	while(i < j) {
    		if(s.charAt(i) != s.charAt(j)) return false;
    		i++;
    		j--;
    	}
    	return true;
    }
}
/*

mlcupuuffuupuculm

		System.out.println(solution.validPalindrome("abchdba"));
		System.out.println(solution.validPalindrome("abcdba"));
		System.out.println(solution.validPalindrome("abca"));	
		System.out.println(solution.validPalindrome("abcbba"));
*/