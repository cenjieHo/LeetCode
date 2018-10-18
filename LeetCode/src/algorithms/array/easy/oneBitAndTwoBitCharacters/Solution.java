package algorithms.array.easy.oneBitAndTwoBitCharacters;

public class Solution {
    public boolean isOneBitCharacter(int[] bits) {
    	if(bits.length == 1)
    		return bits[0] == 0 ? true : false;
        return isOneBitCharacter(bits, bits.length-2);
    }
    
    public boolean isOneBitCharacter(int[] bits, int index) {
    	if(index < 0)
    		return true;
    	if(bits[index] == 0) {
    		if(index-1 < 0 || bits[index-1] == 0) {
    			return isOneBitCharacter(bits, index-1);
    		} else {
    			return isOneBitCharacter(bits, index-2) || isOneBitCharacter(bits, index-1);
    		}
    	} else {
    		if(index-1 < 0 || bits[index-1] == 0) {
    			return false;
    		} else{
    			return isOneBitCharacter(bits, index-2);
    		}
    	}
    }
}
