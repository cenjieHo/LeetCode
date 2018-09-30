package algorithms.array.easy.plusOne;

public class MainClass {
	public static void main(String[] args) {
		int[] nums1 = {3, 5, 7, 9}; 
		int[] nums2 = {3, 5, 9, 9}; 
		int[] nums3 = {9, 9, 9}; 
		
		Solution solution = new Solution();
		int[] resNums1 = solution.plusOne(nums1);
		int[] resNums2 = solution.plusOne(nums2);
		int[] resNums3 = solution.plusOne(nums3);
		
		for(int num : resNums1) {
			System.out.print(num + " ");
		}
		System.out.println();
		for(int num : resNums2) {
			System.out.print(num + " ");
		}
		System.out.println();
		for(int num : resNums3) {
			System.out.print(num + " ");
		}
	}
}
