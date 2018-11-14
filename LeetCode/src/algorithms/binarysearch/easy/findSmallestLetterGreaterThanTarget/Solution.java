package algorithms.binarysearch.easy.findSmallestLetterGreaterThanTarget;

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
    	if(target < letters[0] || target >= letters[letters.length-1]) 
    		return letters[0];
        while(target < 'z') {
        	target += 1;
        	int index = search(letters, target);
        	if(index != -1) return letters[index];
        }
        return letters[0];
    }
    
    private int search(char[] letters, char target) {
        int lo = 0;
        int hi = letters.length-1;
        int middle = lo + (hi - lo) / 2;
        while(lo <= hi) {
        	if(letters[middle] > target) {
        		hi = middle - 1;
        	} else if(letters[middle] < target) {
        		lo = middle + 1;
        	} else {
        		return middle;
        	}
        	middle = lo + (hi - lo) / 2;
        }
        return -1;
    }
}
