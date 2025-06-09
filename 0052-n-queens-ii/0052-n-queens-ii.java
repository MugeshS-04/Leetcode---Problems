class Solution {
    public int totalNQueens(int n) {
        boolean[][] placed = new boolean[n][n];
        int[] count = new int[1];
        solve(placed, n, 0, count);
        System.gc();
        return count[0];
    }

    void solve(boolean[][] placed, int size, int row, int[] count)
    {
        if(row == size)
        {
            count[0]++;
            return;
        }

        for(int col = 0; col < size; col++)
        {
            if(issafe(placed, size, row, col))
            {
                placed[row][col] = true;
                solve(placed, size, row+1, count);
                placed[row][col] = false;
            }
        }
    }

    boolean issafe(boolean[][] placed, int size, int row, int col)
    {
        for(int i = 0; i < size; i++)
        {
            if(placed[i][col])
            {
                return false;
            }
        }

        for(int i = row-1, j = col - 1; i>=0 && j>=0; i--, j--)
        {
            if(placed[i][j])
            {
                return false;
            }
        }
        for(int i = row-1, j = col+1; i>=0 && j<size; i--, j++)
        {
            if(placed[i][j])
            {
                return false;
            }
        }
            
        return true;
    }
}