package algorithms.array.bestTimetoBuyandSellStock;

public class MainClass {
	public static void main(String[] args) {
		int[] nums1 = {7,1,5,3,6,4};
		Solution solution = new Solution();
		int result1 = solution.maxProfit(nums1);
		System.out.println(result1);
	}
}
