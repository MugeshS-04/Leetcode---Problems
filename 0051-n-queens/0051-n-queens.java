class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList();
        
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++)
        {
            Arrays.fill(board[i], '.');
        }

        solve(result, board, n, 0);

        return result;
    }

    void solve(List<List<String>> result, char[][] board, int n, int row)
    {
        if(row == n)
        {
            result.add(construct(board, n));
            return;
        }

        for(int col = 0; col < n; col++)
        {
            if(issafe(board, row, col, n))
            {
                board[row][col] = 'Q';
                solve(result, board, n, row+1);
                board[row][col] = '.';
            }
        }
    }

    boolean issafe(char[][] board, int row, int col, int n)
    {
        for(int i = 0; i < n; i++)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check top-right diagonal ↗️
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    List<String> construct(char[][] board, int n)
    {
        List<String> result = new ArrayList();

        for(int i = 0; i < n; i++)
        {
            result.add(new String(board[i]));
        }

        return result;
    }
}