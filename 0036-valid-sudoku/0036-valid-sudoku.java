class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int row = 0; row < 9; row++)
        {
            for(int col = 0; col < 9; col++)
            {
                if(board[row][col] != '.')
                {
                    if(check_full(board, row, col, board[row][col]) == false)
                    {
                        return false;
                    }

                    if(check_submatrix(board, row, col, board[row][col]) == false)
                    {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    boolean check_full(char[][] board, int row, int col, char val)
    {
        //row
        for(int i = 0; i < 9; i++)
        {
            if(board[i][col] == val && row != i)
            {
                return false;
            }
        }

        //col
        for(int i = 0; i < 9; i++)
        {
            if(board[row][i] == val && col != i)
            {
                return false;
            }
        }

        return true;
    }

    boolean check_submatrix(char board[][], int row, int col, char val)
    {
        int sub_row = (row / 3) * 3;
        int sub_col = (col / 3) * 3;

        for(int i = sub_row; i < sub_row + 3; i++)
        {
            for(int j = sub_col; j < sub_col + 3; j++)
            {
                if(board[i][j] == val && row != i && col != sub_col)
                {
                    return false;
                }
            }
        }

        return true;
    }
}