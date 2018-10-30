package algorithms.hashtable.easy.findTheDifference;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String s1 = "abcd";
		String t1 = "abcde";
		String s2 = "abcdefg";
		String t2 = "efgcdabj";
		System.out.println(solution.findTheDifference(s1, t1));
		System.out.println(solution.findTheDifference(s2, t2));
	}
}
