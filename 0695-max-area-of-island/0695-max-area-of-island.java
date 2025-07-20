class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max_area = 0;

        boolean[][] check = new boolean[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] != 0)
                {
                    int area = getArea(grid, check, i, j, new int[1]);
        
                    if(area > max_area)
                    {
                        max_area = area;
                    }
                }
            }
        }

        return max_area;
    }

    int getArea(int[][] grid, boolean[][] check, int row, int col, int[] area)
    {
        if(row < 0 || row > grid.length-1 || col < 0 || col > grid[0].length - 1 || check[row][col] == true || grid[row][col] == 0)
        {
            return area[0];
        }

        check[row][col] = true;
        area[0] = area[0] + 1;

        getArea(grid, check, row + 1, col, area);
        getArea(grid, check, row - 1, col, area);
        getArea(grid, check, row, col + 1, area);
        getArea(grid, check, row, col - 1, area);

        return area[0];
    }
}