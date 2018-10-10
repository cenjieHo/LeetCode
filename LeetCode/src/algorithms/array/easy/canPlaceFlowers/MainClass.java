package algorithms.array.easy.canPlaceFlowers;

public class MainClass {
	public static void main(String[] args) {
		int[] num1 = {1,0,0,1};
		int[] num2 = {1,0,0};
		int[] num3 = {1,0,0,0,1,0,1};
		int[] num4 = {0,0,1,0,1};
		Solution solution = new Solution();
		System.out.println(solution.canPlaceFlowers(num1, 1));
		System.out.println(solution.canPlaceFlowers(num2, 1));
		System.out.println(solution.canPlaceFlowers(num3, 2));
		System.out.println(solution.canPlaceFlowers(num4, 1));
	}
}
