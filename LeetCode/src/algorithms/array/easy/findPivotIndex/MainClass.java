package algorithms.array.easy.findPivotIndex;

public class MainClass {
	public static void main(String[] args) {
		int[] num1 = {-1, 2, 3, -6 , 5, 4, -5};
		int[] num2 = {1, 7, 3, 6, 5, 6};
		int[] num3 = {1, 2, 3};
		int[] num4 = {2, 1, 2};
		int[] num5 = {-1, -1, -1, -1, -1, 0};
		int[] num6 = {0, 1, 1, 1, 1, 1};
		
		Solution solution = new Solution();
		System.out.println(solution.pivotIndex(num1));	//3	
		System.out.println(solution.pivotIndex(num2));	//3
		System.out.println(solution.pivotIndex(num3));	//-1
		System.out.println(solution.pivotIndex(num4));	//1
		System.out.println(solution.pivotIndex(num5));	//2
		System.out.println(solution.pivotIndex(num6));	//3
	}
}
