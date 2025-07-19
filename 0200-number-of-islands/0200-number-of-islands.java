class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] check = new boolean[grid.length][grid[0].length];
        int count = 0;

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(countIsland(grid, check, i, j, 0) != 0)
                {
                    count++;
                }
            }
        }

        return count;
    }

    int countIsland(char[][] grid, boolean[][] check, int row, int col, int val)
    {
        if(row < 0 || row > grid.length-1 || col < 0 || col > grid[0].length-1 || check[row][col] == true || grid[row][col] == '0')
        {
            return val;
        }

        if(grid[row][col] == '1')
        {
            check[row][col] = true;
            val++;
        }

        countIsland(grid, check, row+1, col, val);
        countIsland(grid, check, row-1, col, val);
        countIsland(grid, check, row, col+1, val);
        countIsland(grid, check, row, col-1, val);

        return val;

        
    }
}