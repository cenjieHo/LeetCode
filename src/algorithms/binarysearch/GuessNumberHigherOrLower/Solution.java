package algorithms.binarysearch.GuessNumberHigherOrLower;

public class Solution extends GuessGame{
    public int guessNumber(int n) {
        int lo = 1;
        int hi = n;
        int middle = lo + (hi - lo) / 2;
        while(lo <= hi){
            int flag = guess(middle);
            if(flag < 0){
            	hi = middle - 1;
            } else if(flag > 0){
            	lo = middle + 1;
            } else{
                return middle;
            }
            middle = lo + (hi - lo) / 2;
        }
        return -1;
    }
}
