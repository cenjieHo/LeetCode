package algorithms.tree.uniqueBinarySearchTrees;

public class Solution {
    public int numTrees(int n) {
        if(n < 1)
        	return 0;
        int[] res = new int[n+1];
        res[0] = 1;
        for(int i = 1; i <= n; i++) {
        	for(int j = 0; j < i; j++) {
        		res[i] += res[j] * res[i-j-1];
        	}
        }
        return res[n];
    }
}


