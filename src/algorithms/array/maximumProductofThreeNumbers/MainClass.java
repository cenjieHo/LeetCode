package algorithms.array.maximumProductofThreeNumbers;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] num1 = {1,2,3};
		int[] num2 = {1,2,3,4};
		int[] num3 = {0,0,0};
		int[] num4 = {-2,-3,1,2,3};
		int[] num5 = {-1,-2,-3};
		System.out.println(solution.maximumProduct(num1));
		System.out.println(solution.maximumProduct(num2));
		System.out.println(solution.maximumProduct(num3));
		System.out.println(solution.maximumProduct(num4));
		System.out.println(solution.maximumProduct(num5));
	}
}
