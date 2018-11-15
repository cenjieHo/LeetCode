package algorithms.hashtable.distributeCandies;

public class MainClass {
	public static void main(String[] args) {
		int[] a1 = {1,1,2,2,3,3};
		int[] a2 = {1,1,2,3};
		int[] a3 = {1,1,1,1};
		Solution solution = new Solution();
		System.out.println(solution.distributeCandies(a1));
		System.out.println(solution.distributeCandies(a2));
		System.out.println(solution.distributeCandies(a3));
	}
}
