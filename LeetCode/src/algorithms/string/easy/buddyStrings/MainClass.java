package algorithms.string.easy.buddyStrings;

public class MainClass {
	public static void main(String[] args) {
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
		Solution solution = new Solution();
		System.out.println(solution.buddyStrings(a1, b1));
		System.out.println(solution.buddyStrings(a2, b2));
		System.out.println(solution.buddyStrings(a3, b3));
		System.out.println(solution.buddyStrings(a4, b4));
		System.out.println(solution.buddyStrings(a5, b5));
	}
}
