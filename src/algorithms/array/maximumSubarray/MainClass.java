package algorithms.array.maximumSubarray;

public class MainClass {
	public static void main(String[] args) {
		int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums2 = {0, 3, -1, 4, 6};
		Solution solution = new Solution();
		try {
			System.out.println(solution.maxSubArray(nums1));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println(solution.maxSubArray(nums2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
