class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                if(wordsearch(board, visited, word, i, j, 0))
                {
                    return true;
                }
            }
        }

        return false;
    }

    boolean wordsearch(char[][] board, boolean[][] visited, String word, int row, int col, int iter)
    {
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || visited[row][col] || board[row][col] != word.charAt(iter))
        {
            return false;
        }

        if(iter == word.length()-1)
        {
            return true;
        }

        visited[row][col] = true;

        boolean found =  wordsearch(board, visited, word, row-1, col, iter + 1 ) ||
                         wordsearch(board, visited, word, row+1, col, iter + 1) ||
                         wordsearch(board, visited, word, row, col-1, iter + 1) ||
                         wordsearch(board, visited, word, row, col+1, iter + 1);
        
       visited[row][col] = false;

       return found;
    }
}