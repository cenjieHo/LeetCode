package algorithms.bitManipulation.powerOfFour;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.isPowerOfFour(4));
		System.out.println(solution.isPowerOfFour(16));
		System.out.println(solution.isPowerOfFour(64));
		System.out.println(solution.isPowerOfFour(0));
		System.out.println(solution.isPowerOfFour(1));
		System.out.println(solution.isPowerOfFour(-1));
	}
}
