package algorithms.array.easy.mergeSortedArray;

public class MainClass {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int m1 = 3;
		int[] nums2 = {2,5,6};
		int m2 = 3;
		Solution solution = new Solution();
		solution.merge(nums1, m1, nums2, m2);
		for(int num : nums1) {
			System.out.print(num + " ");
		}
	}
}
