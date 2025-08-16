class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    boolean solve(char[][] board)
    {
        for(int row = 0; row < 9; row++)
        {
            for(int col = 0; col < 9; col++)
            {
                if(board[row][col] == '.')
                {
                    for(char digit = '1'; digit <= '9'; digit++)
                    {
                        if(isvalid(board, row, col, digit))
                        {
                            board[row][col] = digit;
                            if(solve(board))
                            {
                                return true;
                            }
                            board[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    boolean isvalid(char[][] board, int row, int col, char digit)
    {
        for(int i = 0; i < 9; i++)
        {
            if(board[row][i] == digit)
            {
                return false;
            }
            if(board[i][col] == digit)
            {
                return false;
            }

            int rowgrid = 3 * (row/3) + i/3;
            int colgrid = 3 * (col/3) + i%3;

            if(board[rowgrid][colgrid] == digit)
            {
                return false;
            }
        }

        return true;
    }
}