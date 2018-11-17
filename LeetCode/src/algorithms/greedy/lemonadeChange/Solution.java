package algorithms.greedy.lemonadeChange;

public class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for(int i = 0; i < bills.length; i++) {
        	if(bills[i] == 20) {
        		if(ten >= 1 && five >= 1) {
        			ten--;
        			five--;
        		} else if(five >= 3) {
        			five -= 3;
        		} else {
        			return false;
        		}
        	} else if(bills[i] == 10) {
        		if(five >= 1) {
        			ten++;
        			five--;
        		} else {
        			return false;
        		}
        	} else {
        		five++;
        	}
        }
        return true;
    }
}