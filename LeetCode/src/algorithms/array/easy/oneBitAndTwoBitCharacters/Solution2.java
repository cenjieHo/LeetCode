package algorithms.array.easy.oneBitAndTwoBitCharacters;

public class Solution2 {
    public boolean isOneBitCharacter(int[] bits) {
    	int i = 0;
    	while(i < bits.length) {
    		if(bits[i] == 1) {
    			i+=2;
    		} else {
    			if(i == bits.length - 1)
    				return true;
    			i++;
    		}
    	}
    	return false;
    }
}
