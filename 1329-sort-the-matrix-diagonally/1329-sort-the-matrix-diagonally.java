class Solution {
    public int[][] diagonalSort(int[][] grid) {
        PriorityQueue<Integer> myq = new PriorityQueue<>();
        int row = grid.length - 1;
        int col = 0;

        while(row != -1)
        {
            for(int i = row, j = col; i < grid.length && j < grid[0].length; i++, j++)
            {
                myq.add(grid[i][j]);
            }
            for(int i = row, j = col; i < grid.length && j < grid[0].length; i++, j++)
            {
                grid[i][j] = myq.poll();
            }

            row--;
        }

        row = 0;

        while(col != grid[0].length)
        {
            for(int i = row, j = col; i < grid.length && j < grid[0].length; i++, j++)
            {
                myq.add(grid[i][j]);
            }
            for(int i = row, j = col; i < grid.length && j < grid[0].length; i++, j++)
            {
                grid[i][j] = myq.poll();
            }

            col++;
        }

        return grid;
    }
}