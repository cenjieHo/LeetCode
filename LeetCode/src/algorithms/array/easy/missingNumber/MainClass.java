package algorithms.array.easy.missingNumber;

public class MainClass {
	public static void main(String[] args) {
		int[] num1 = {3,0,1};
		int[] num2 = {9,6,4,2,3,5,7,0,1};
		Solution2 solution = new Solution2();
		int res1 = solution.missingNumber(num1);
		int res2 = solution.missingNumber(num2);
		System.out.println(res1);
		System.out.println(res2);
	}
}
