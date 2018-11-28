package algorithms.array.flippingAnImage;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[][] nums1 = {{1,1,0},{1,0,1},{0,0,0}};
		int[][] nums2 = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		int[][] nums3 = {{1}};
		
		int[][] result1 = solution.flipAndInvertImage(nums1);
		int[][] result2 = solution.flipAndInvertImage(nums2);
		int[][] result3 = solution.flipAndInvertImage(nums3);
		
		for(int[] nums : result1){
			System.out.print("[");
			for(int num : nums){
				System.out.print(num + ",");
			}
			System.out.print("]");
		}
		System.out.println();
		
		for(int[] nums : result2){
			System.out.print("[");
			for(int num : nums){
				System.out.print(num + ",");
			}
			System.out.print("]");
		}
		System.out.println();
		
		for(int[] nums : result3){
			System.out.print("[");
			for(int num : nums){
				System.out.print(num + ",");
			}
			System.out.print("]");
		}
		System.out.println();
		
	}
}
