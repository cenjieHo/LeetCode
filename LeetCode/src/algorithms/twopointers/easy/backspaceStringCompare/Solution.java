package algorithms.twopointers.easy.backspaceStringCompare;

public class Solution {
    public boolean backspaceCompare(String S, String T) {
    	int i = S.length() - 1, j = T.length() - 1;
        while(true) {
            for (int b = 0; i >= 0 && (b > 0 || S.charAt(i) == '#'); --i)
            	b += S.charAt(i) == '#' ? 1 : -1;
            for (int b = 0; j >= 0 && (b > 0 || T.charAt(j) == '#'); --j)
            	b += T.charAt(j) == '#' ? 1 : -1;
            if (i >= 0 && j >= 0 && S.charAt(i) == T.charAt(j)) {
                i--;
                j--;
            } else {
                return i == -1 && j == -1;
            }
        }
    }
}
