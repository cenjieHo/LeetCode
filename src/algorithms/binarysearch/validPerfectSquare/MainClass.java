package algorithms.binarysearch.validPerfectSquare;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.isPerfectSquare(1));
		System.out.println(solution.isPerfectSquare(2));
		System.out.println(solution.isPerfectSquare(3));
		System.out.println(solution.isPerfectSquare(4));
		System.out.println(solution.isPerfectSquare(8));
		System.out.println(solution.isPerfectSquare(9));
		System.out.println(solution.isPerfectSquare(16));
		System.out.println(solution.isPerfectSquare(2147483647));
	}
}
