package algorithms.math.palindromeNumber;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.isPalindrome(121));
		System.out.println(solution.isPalindrome(-121));
		System.out.println(solution.isPalindrome(100));
		System.out.println(solution.isPalindrome(1001));
		System.out.println(solution.isPalindrome(2147483647));
	}
}
