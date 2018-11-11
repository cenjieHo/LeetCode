package algorithms.string.easy.validPalindromeII;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.validPalindrome("abchdba"));
		System.out.println(solution.validPalindrome("abcdba"));
		System.out.println(solution.validPalindrome("abca"));	
		System.out.println(solution.validPalindrome("abcbba"));

		System.out.println(solution.validPalindrome("mlcupuuffuupuculm"));
	}
}
