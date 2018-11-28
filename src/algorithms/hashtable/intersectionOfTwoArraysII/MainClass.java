package algorithms.hashtable.intersectionOfTwoArraysII;

import algorithms.hashtable.intersectionOfTwoArraysII.Solution;

public class MainClass {
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};
		int[] nums3 = {4, 9, 5};
		int[] nums4 = {9, 4, 9, 8, 4};
		Solution2 solution = new Solution2();
		int[] res1 = solution.intersect(nums1, nums2);
		int[] res2 = solution.intersect(nums3, nums4);
		for(int n : res1) {
			System.out.print(n + " ");
		}
		System.out.println();
		for(int n : res2) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
