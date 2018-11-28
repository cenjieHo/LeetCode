package algorithms.greedy.assignCookies;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] g1 = {1,2,3};
		int[] s1 = {1,1};
		int[] g2 = {1,2};
		int[] s2 = {1,1,2};
		System.out.println(solution.findContentChildren(g1, s1));
		System.out.println(solution.findContentChildren(g2, s2));
	}
}
