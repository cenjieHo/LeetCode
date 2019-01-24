package algorithms.math.uglyNumber;

public class Solution {
    public boolean isUgly(int num) {
    	if(num == 0)
    		return false;
    	if(num == 1 || num == 2 || num == 3 || num == 5)
    		return true;
    	else {
    		boolean flag1 = false, flag2 = false, flag3 = false;
    		if(num % 2 == 0) flag1 = isUgly(num/2);
    		else if(num % 3 == 0) flag2 = isUgly(num/3);
    		else if(num % 5 == 0) flag3 = isUgly(num/5);
    		return flag1 || flag2 || flag3;
    	}
    		
    }
}
