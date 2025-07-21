class Solution {
    public int orangesRotting(int[][] grid) {
        Queue <int[]> myq = new LinkedList<>();
        boolean[][] check = new boolean[grid.length][grid[0].length];
        int count = 0;
        int fresh = 0;
        

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 2)
                {
                    myq.add(new int[]{i, j});
                    check[i][j] = true;
                }
                if(grid[i][j] == 1)
                {
                    fresh++;
                }
            }
        }

        if(fresh == 0)
        {
            return 0;
        }

        while(!myq.isEmpty())
        {
            int size = myq.size();

            while(size > 0)
            {
                int[] pos = myq.poll();
                int row = pos[0];
                int col = pos[1];

                if(row - 1 >= 0 && check[row-1][col] == false && grid[row - 1][col] == 1)
                {
                    check[row-1][col] = true;
                    fresh--;
                    myq.add(new int[]{row - 1, col});
                }


                if(row + 1 < grid.length && check[row+1][col] == false && grid[row + 1][col] == 1)
                {
                    check[row+1][col] = true;
                    fresh--;
                    myq.add(new int[]{row+1, col});
                }

                if(col - 1 >= 0 && check[row][col - 1] == false && grid[row][col - 1] == 1)
                {
                    check[row][col-1] = true;
                    fresh--;
                    myq.add(new int[]{row, col-1});
                }

                if(col + 1 < grid[0].length && check[row][col+1] == false && grid[row][col+1] == 1)
                {
                    check[row][col+1] = true;
                    fresh--;
                    myq.add(new int[]{row, col+1});
                }

                size--;
            }
            count++;
        }

        if(fresh != 0)
        {
            return -1;
        }
        return count-1;
    }
}