package algorithms.greedy.assignCookies;

import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
    	int cnt = 0;
    	int i = 0, j = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(j != s.length && i != g.length) {
        	if(s[j] >= g[i]) {
        		cnt++;
        		i++;
        		j++;
        	} else {
        		j++;
        	}
        }
        return cnt;
    }
}
