package algorithms.hashtable.validAnagram;

public class MainClass {
	public static void main(String[] args) {
		Solution3 solution = new Solution3();
		String s1 = "anagram";
		String t1 = "nagaram";
		String s2 = "rat";
		String t2 = "car";
		String s3 = "";
		String t3 = "";
		String s4 = "abba";
		String t4 = "aaab";
		System.out.println(solution.isAnagram(s1, t1));
		System.out.println(solution.isAnagram(s2, t2));
		System.out.println(solution.isAnagram(s3, t3));
		System.out.println(solution.isAnagram(s4, t4));
	}
}
