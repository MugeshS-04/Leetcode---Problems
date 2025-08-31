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
                    for(char ch = '1'; ch <= '9'; ch++)
                    {
                        if(check(board, row, col, ch))
                        {
                            board[row][col] = ch;
                            if(solve(board)) return true;
                            board[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }

        return true;
    }

    boolean check(char[][] board, int row, int col, char ch)
    {
        //row & col
        for(int i = 0; i < 9; i++)
        {
            if(board[i][col] == ch)
            {
                return false;
            }

            if(board[row][i] == ch)
            {
                return false;
            }
        }

        //sub-matrix
        int r = (row/3) * 3;
        int c = (col/3) * 3;

        for(int i = r; i < r+3; i++)
        {
            for(int j = c; j < c+3; j++)
            {
                if(board[i][j] == ch)
                {
                    return false;
                }
            }
        }

        return true;
    }
}