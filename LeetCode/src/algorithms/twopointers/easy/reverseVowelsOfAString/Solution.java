package algorithms.twopointers.easy.reverseVowelsOfAString;

public class Solution {
	private char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
	
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length-1;
        
        while(i <= j) {
        	if(isVowels(arr[i]) && isVowels(arr[j])) {
        		char temp = arr[i];
        		arr[i] = arr[j];
        		arr[j] = temp;
        		i++;
        		j--;
        		continue;
        	}
        	if(!isVowels(arr[i]))
        		i++;
        	if(!isVowels(arr[j]))
        		j--;
        }
        return new String(arr);
    }
    
    private boolean isVowels(char c) {
    	for(int i = 0; i < vowels.length; i++) {
    		if(c == vowels[i]) return true;
    	}
    	return false;
    }
}
