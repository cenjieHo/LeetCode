package algorithms.tree.pathSumIII;

import java.util.HashMap;

public class Solution2 {
    public int pathSum(TreeNode root, int sum) {
    	HashMap<Integer, Integer> sumMap = new HashMap<>();
    	sumMap.put(0, 1);
    	return pathSumCore(root, 0, sum, sumMap);
    }
    
    private int pathSumCore(TreeNode root, int currSum, int target, HashMap<Integer, Integer> sumMap) {
    	if(root == null)
    		return 0;
    	currSum += root.val;
    	int res = sumMap.getOrDefault(currSum-target, 0);
    	sumMap.put(currSum, sumMap.getOrDefault(currSum, 0)+1);
    	res += pathSumCore(root.left, currSum, target, sumMap) + pathSumCore(root.right, currSum, target, sumMap);
    	sumMap.put(currSum, sumMap.get(currSum)-1);
    	return res;
    }
}
