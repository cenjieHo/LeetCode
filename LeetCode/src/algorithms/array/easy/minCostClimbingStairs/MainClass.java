package algorithms.array.easy.minCostClimbingStairs;

public class MainClass {
	public static void main(String[] args) {
		int[] nums1 = {1, 2};
		int[] nums2 = {1, 2, 3};
		int[] nums3 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		int[] nums4 = {10, 15, 20};
		int[] nums5 = {0, 0, 0, 1};
		Solution solution = new Solution();
		System.out.println(solution.minCostClimbingStairs(nums1));	//1
		System.out.println(solution.minCostClimbingStairs(nums2));	//2
		System.out.println(solution.minCostClimbingStairs(nums3));	//6	
		System.out.println(solution.minCostClimbingStairs(nums4));	//15
		System.out.println(solution.minCostClimbingStairs(nums5));	//0
	}
}
