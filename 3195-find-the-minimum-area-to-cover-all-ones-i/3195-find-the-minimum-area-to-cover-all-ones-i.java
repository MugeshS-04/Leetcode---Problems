class Solution {
    public int minimumArea(int[][] grid) {
        int top = Integer.MAX_VALUE;
        int down = -1;
        int left = Integer.MAX_VALUE;
        int right = -1;

        //top
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 1)
                {
                    top = Math.min(top, i+1);
                    left = Math.min(left, j+1);
                    right = Math.max(right, j+1);
                    down = Math.max(down, i+1);
                }
            }
        }

        System.out.print(top+" "+down+" "+left+" "+right);

        return ((down - top)+1) * ((right - left)+1);
        
    }
}