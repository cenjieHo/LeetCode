package algorithms.array.easy.rotateArray;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums1 = {1,2,3,4,5,6,7};
		int k1 = 3;
		int[] nums2 = {1, 2};
		int k2 = 3;
		solution.rotate(nums1, k1);
		solution.rotate(nums2, k2);
		for(int num : nums1) {
			System.out.print(num + " ");
		}
		System.out.println();
		for(int num : nums2) {
			System.out.print(num + " ");
		}
	}
}
