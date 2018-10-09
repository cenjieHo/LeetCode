package algorithms.array.easy.maxConsecutiveOnes;

public class MainClass {
	public static void main(String[] args) {
		int[] num1 = {1,1,0,1,1,1};
		int[] num2 = {0,0,0,0,0,0};
		int[] num3 = {1,1,1,1,1,1};
		int[] num4 = {0,0,1,0,1,0};
		Solution solution = new Solution();
		System.out.println(solution.findMaxConsecutiveOnes(num1));	//3
		System.out.println(solution.findMaxConsecutiveOnes(num2));	//0
		System.out.println(solution.findMaxConsecutiveOnes(num3));	//6
		System.out.println(solution.findMaxConsecutiveOnes(num4));	//1
	}
}
