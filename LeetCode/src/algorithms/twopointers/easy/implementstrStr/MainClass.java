package algorithms.twopointers.easy.implementstrStr;

public class MainClass {
	public static void main(String[] args) {
		String h1 = "hello";
		String n1 = "ll";
		String h2 = "aaaaa";
		String n2 = "aab";
		Solution solution = new Solution();
		System.out.println(solution.strStr(h1, n1));
		System.out.println(solution.strStr(h2, n2));
	}
}
