package algorithms.array.thirdMaximumNumber;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] num1 = {3, 3, 0, 2, 1};	//1
		int[] num2 = {1, 2};			//2
		int[] num3 = {2, 0, 3, 0, 1};	//1
		int[] num4 = {3};				//3
		int[] num5 = {-2147483648,-2147483648,-2147483648,-2147483648,1,1,1};				//1
		
		System.out.println(solution.thirdMax(num1));
		System.out.println(solution.thirdMax(num2));
		System.out.println(solution.thirdMax(num3));
		System.out.println(solution.thirdMax(num4));
		System.out.println(solution.thirdMax(num5));
	}
}
