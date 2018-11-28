package algorithms.array.toeplitzMatrix;

public class MainClass {
	public static void main(String[] args) {
		int[][] nums1 = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
		int[][] nums2 = {{1,2},{2,2}};
		int[][] nums3 = {{2}};
		Solution solution = new Solution();
		System.out.println(solution.isToeplitzMatrix(nums1));
		System.out.println(solution.isToeplitzMatrix(nums2));
		System.out.println(solution.isToeplitzMatrix(nums3));
	}
}

/**
matrix = [
[1,2,3,4],
[5,1,2,3],
[9,5,1,2]
]

matrix = [
[1,2],
[2,2]
]

matrix = [
[2]
]
**/