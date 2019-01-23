package algorithms.dfs.floodFill;

public class Solution {
	private int val;
	private boolean[][] visit;
	
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(sr >= image.length || sc >= image[0].length)
        	return image;
        val = image[sr][sc];
        visit = new boolean[image.length][image[0].length];
        floodFillCore(image, sr, sc, newColor);
        return image;
    }
    
    private void floodFillCore(int[][] image, int sr, int sc, int newColor) {
    	if(sr >= 0 && sr < image.length && sc >= 0 && 
    			sc < image[0].length && !visit[sr][sc] && image[sr][sc] == val) {
    		image[sr][sc] = newColor;
    		visit[sr][sc] = true;
    		floodFillCore(image, sr+1, sc, newColor);
    		floodFillCore(image, sr-1, sc, newColor);
    		floodFillCore(image, sr, sc+1, newColor);
    		floodFillCore(image, sr, sc-1, newColor);
    	}
    }
}
