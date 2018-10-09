package algorithms.array.easy.arrayPartitionI;

public class MainClass {
	public static void main(String[] args) {
		int[] num1 = {1,4,3,2};
		int[] num2 = {2,4};
		Solution solution = new Solution();
		System.out.println(solution.arrayPairSum(num1));
		System.out.println(solution.arrayPairSum(num2));
	}
}
