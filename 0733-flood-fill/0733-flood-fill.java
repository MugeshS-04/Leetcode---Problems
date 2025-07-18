class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        fill(image, sr, sc, color, image[sr][sc], vis);
        return image;
    }

    void fill(int[][] image, int sr, int sc, int color, int same_color, boolean[][] vis)
    {
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || vis[sr][sc] == true || image[sr][sc] != same_color)
        {
            return;
        }

        vis[sr][sc] = true;

        image[sr][sc] = color;

        fill(image, sr+1, sc, color, same_color, vis);
        fill(image, sr-1, sc, color, same_color, vis);
        fill(image, sr, sc+1, color, same_color, vis);
        fill(image, sr, sc-1, color, same_color, vis);

        return;
    }
}