class Solution {
    public int[][] sortMatrix(int[][] grid) {
        
        PriorityQueue<Integer> myq = new PriorityQueue<>((a,b) -> b - a);
        int row = grid.length - 1;
        int col = 0;

        while(row != -1)
        {
            for(int i = row, j = col; i < grid.length && j < grid.length; i++, j++)
            {
                myq.add(grid[i][j]);
            }
            for(int i = row, j = col; i < grid.length && j < grid.length; i++, j++)
            {
                grid[i][j] = myq.poll();
            }

            row--;
        }

        PriorityQueue<Integer> myq1 = new PriorityQueue<>();
        row = 0;
        col = 1;

        while(col != grid.length)
        {
            for(int i = row, j = col; i < grid.length && j < grid.length; i++, j++)
            {
                myq1.add(grid[i][j]);
            }
            for(int i = row, j = col; i < grid.length && j < grid.length; i++, j++)
            {
                grid[i][j] = myq1.poll();
            }

            col++;
        }

        return grid;
    }
}