package algorithms.math.perfectNumber;

import java.util.ArrayList;

public class Solution {
    public boolean checkPerfectNumber(int num) {
    	if(num == 0) return false;
        int n = 1;
        int sum = 0;
        while(n < num) {
        	if(num % n == 0) {
        		sum += n;
        	}
        	if(sum > num) {
        		break;
        	}
        	n++;
        }
        return sum == num;
    }
}
