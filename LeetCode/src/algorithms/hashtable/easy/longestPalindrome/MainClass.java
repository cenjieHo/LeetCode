package algorithms.hashtable.easy.longestPalindrome;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String str1 = "abccccdd";
		String str2 = "abcdefg";
		String str3 = "aaaccc";
		System.out.println(solution.longestPalindrome(str1));
		System.out.println(solution.longestPalindrome(str2));
		System.out.println(solution.longestPalindrome(str3));
	}
}
