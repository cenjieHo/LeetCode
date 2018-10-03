package algorithms.array.easy.twoSumII;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] num1 = {1,3,4,6,8};
		int tar1 = 5;
		int[] num2 = {2,7,11,15};
		int tar2 = 9;
		
		int[] res1 = solution.twoSum(num1, tar1);
		int[] res2 = solution.twoSum(num2, tar2);
		for(int n : res1) {
			System.out.print(n+" ");
		}
		System.out.println();
		for(int n : res2) {
			System.out.print(n+" ");
		}
	}
}
