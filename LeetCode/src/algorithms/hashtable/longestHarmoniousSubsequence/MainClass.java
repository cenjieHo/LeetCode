package algorithms.hashtable.longestHarmoniousSubsequence;

public class MainClass {
	public static void main(String[] args) {
		int[] a1 = {1,3,2,2,5,2,3,7};
		int[] a2 = {0,3,1,3,3,3,0,1,0,2,0,3,1,3,-3,2,0,3,1,2,2,-3,2,2,3,3};
		Solution solution = new Solution();
		System.out.println(solution.findLHS(a1));
		System.out.println(solution.findLHS(a2));
	}
}
