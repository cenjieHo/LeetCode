package algorithms.bitManipulation.powerOfTwo;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.isPowerOfTwo(1));
		System.out.println(solution.isPowerOfTwo(4));
		System.out.println(solution.isPowerOfTwo(16));
		System.out.println(solution.isPowerOfTwo(64));
		System.out.println(solution.isPowerOfTwo(0));
		System.out.println(solution.isPowerOfTwo(-2147483648));
	}
}
