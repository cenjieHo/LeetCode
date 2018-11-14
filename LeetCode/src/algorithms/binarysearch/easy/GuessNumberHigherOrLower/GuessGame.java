package algorithms.binarysearch.easy.GuessNumberHigherOrLower;

public class GuessGame {
	protected int guess(int num) {
		int pick = 6;
		if(num < pick) return 1;
		else if(num > pick) return -1;
		else return 0;
	}
}
