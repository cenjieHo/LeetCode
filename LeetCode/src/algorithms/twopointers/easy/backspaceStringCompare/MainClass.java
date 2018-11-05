package algorithms.twopointers.easy.backspaceStringCompare;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String s1 = "ab#c";
		String t1 = "ad#c";
		String s2 = "ab##";
		String t2 = "c#d#";
		String s3 = "a##c";
		String t3 = "#a#c";
		String s4 = "a#c";
		String t4 = "b";
		System.out.println(solution.backspaceCompare(s1, t1));
		System.out.println(solution.backspaceCompare(s2, t2));
		System.out.println(solution.backspaceCompare(s3, t3));
		System.out.println(solution.backspaceCompare(s4, t4));
	}
}
