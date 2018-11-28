package algorithms.array.majorityElement;

public class MainClass {
	public static void main(String[] args) {
		int[] nums1 = {2,2,1,1,1,2,2};
		int[] nums2 = {3,2,3};
		Solution solution = new Solution();
		System.out.println(solution.majorityElement(nums1));
		System.out.println(solution.majorityElement(nums2));
	}
}
