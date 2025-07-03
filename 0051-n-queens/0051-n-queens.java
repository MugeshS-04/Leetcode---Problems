class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList();

        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++)
        {
            Arrays.fill(board[i], '.');
        }

        solve(result, board, 0);

        return result;
    }

    void solve(List<List<String>> result, char[][] board, int row)
    {
        if(row == board.length)
        {
            result.add(makelist(board));
            return;
        }

        for(int col = 0; col < board[0].length; col++)
        {
            if(isvalid(board, row, col))
            {
                board[row][col] = 'Q';
                solve(result, board, row+1);
                board[row][col] = '.';
            }
        }
    }

    boolean isvalid(char[][] board, int row, int col)
    {
        for(int i = 0; i < board.length; i++)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }

        for(int i = row-1, j = col-1; i>=0 && j>=0; i--,j--)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }

        for(int i = row-1, j = col+1; i >=0 && j < board.length; i--,j++)
        {
            if(board[i][j] == 'Q')
            {
                return false;
            }
        }

        return true;

        
    }

    List<String> makelist(char[][] board)
    {
        List<String> current = new ArrayList();

        for(int i = 0; i < board.length; i++)
        {
            current.add(new String(board[i]));
        }

        return current;
    }
}