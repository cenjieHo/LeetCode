package algorithms.twopointers.validPalindrome;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String str1 = "A man, a plan, a canal: Panama";
		String str2 = "race a car";
		String str3 = "0P0";
		System.out.println(solution.isPalindrome(str1));
		System.out.println(solution.isPalindrome(str2));
		System.out.println(solution.isPalindrome(str3));
	}
}
