package algorithms.array.MaximumAverageSubarrayI;

public class MainClass {
	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		int[] num1 = {1,12,-5,-6,50,3};
		int[] num2 = {-1,-2,-3};
		int[] num3 = {-1,-2,3};
		System.out.println(solution.findMaxAverage(num1, 4));
		System.out.println(solution.findMaxAverage(num2, 2));
		System.out.println(solution.findMaxAverage(num3, 2));
	}
}
