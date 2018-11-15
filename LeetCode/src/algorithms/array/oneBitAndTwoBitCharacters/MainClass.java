package algorithms.array.oneBitAndTwoBitCharacters;

public class MainClass {
	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		int[] num1 = {0};
		int[] num2 = {1};
		int[] num3 = {0,0};
		int[] num4 = {1,0,0};
		int[] num5 = {0,1,0};
		int[] num6 = {1,1,1,0};
		int[] num7 = {1,1,0,0};
		int[] num8 = {1,0};
		System.out.println(solution.isOneBitCharacter(num1));	//true
		System.out.println(solution.isOneBitCharacter(num2)); 	//false
		System.out.println(solution.isOneBitCharacter(num3));	//true
		System.out.println(solution.isOneBitCharacter(num4));	//true
		System.out.println(solution.isOneBitCharacter(num5));	//false
		System.out.println(solution.isOneBitCharacter(num6));	//false
		System.out.println(solution.isOneBitCharacter(num7));	//true
		System.out.println(solution.isOneBitCharacter(num8));	//false
	}
}
