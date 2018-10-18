package algorithms.array.easy.transposeMatrix;

public class MainClass {
    public static void main(String[] args) {
    	Solution solution = new Solution();
    	int[][] nums1 = {{1,2,3},{4,5,6},{7,8,9}};
    	int[][] nums2 = {{1,2,3},{4,5,6}};
    	int[][] result1 = solution.transpose(nums1);
    	int[][] result2 = solution.transpose(nums2);
    	for(int[] nums : result1) {
    		System.out.print("[");
    		for(int num : nums) {
    			System.out.print(num + ",");
    		}
    		System.out.print("]");
    	}
    	System.out.println();
    	
    	for(int[] nums : result2) {
    		System.out.print("[");
    		for(int num : nums) {
    			System.out.print(num + ",");
    		}
    		System.out.print("]");
    	}
    	System.out.println();
    }
}
