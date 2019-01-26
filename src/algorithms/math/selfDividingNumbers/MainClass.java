package algorithms.math.selfDividingNumbers;

import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		Solution solution = new Solution();
		List<Integer> res = solution.selfDividingNumbers(1, 22);
		for(int e : res) {
			System.out.print(e + " ");
		}
	}
}
