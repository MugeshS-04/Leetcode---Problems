class Solution {
    public void gameOfLife(int[][] board) {
        int row = board.length;
        int col = board[0].length;

        boolean[][] temp_board = new boolean[row][col];

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
               if(board[i][j] == 1) temp_board[i][j] = true;
            }
        }

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
               livecheck(temp_board, i, j, board);
            }
        }
    }

    void livecheck(boolean[][] board, int row, int col, int[][] b)
    {
        int count = 0;

        if(row - 1 >= 0)
        {
            //top
            if(board[row-1][col] == true)
            {
                count++;
            }

            //top-left
            if(col - 1 >= 0 && board[row-1][col-1] == true)
            {
                count++;
            }

            //top-right
            if(col + 1 <= board[0].length-1 && board[row-1][col+1] == true)
            {
                count++;
            }
        }

        if(row + 1 <= board.length-1)
        {
            //bottom
            if(board[row+1][col] == true)
            {
                count++;
            }

            //bottom-left
            if(col - 1 >= 0 && board[row+1][col-1] == true)
            {
                count++;
            }

            //bottom-right
            if(col + 1 <= board[0].length-1 && board[row+1][col+1] == true)
            {
                count++;
            }
        }

        //left
        if(col - 1 >= 0 && board[row][col-1] == true)
        {
            count++;
        }

        //right
        if(col + 1 <= board[0].length-1 && board[row][col+1] == true)
        {
            count++;
        }

        if(board[row][col])
        {
            if(count == 2 || count == 3)
            {
                b[row][col] = 1;
                return;
            }
            b[row][col] = 0;
        }
        else
        {
            if(count == 3)
            {
                b[row][col] = 1;
                return;
            }
        }

        return;

    }
}