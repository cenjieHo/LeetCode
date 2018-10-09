package algorithms.array.easy.moveZeroes;

public class MainClass {
	public static void main(String[] args) {
		int[] nums1 = {0,1,0,3,12};
		int[] nums2 = {0,0,1,1};
		int[] nums3 = {1,1,0,1,0,0};
		int[] nums4 = {0};
		Solution solution = new Solution();
		solution.moveZeroes(nums1);
		solution.moveZeroes(nums2);
		solution.moveZeroes(nums3);
		solution.moveZeroes(nums4);
		for(int num : nums1) {
			System.out.print(num + " ");
		}
		System.out.println();
		for(int num : nums2) {
			System.out.print(num + " ");
		}
		System.out.println();
		for(int num : nums3) {
			System.out.print(num + " ");
		}
		System.out.println();
		for(int num : nums4) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
