package algorithms.binarysearch.validPerfectSquare;

public class Solution3 {
	public boolean isPerfectSquare(int num) {
        long x = num;
        while (x * x > num) {
            x = (x + num / x) / 2;
        }
        return x * x == num;
    }
}
