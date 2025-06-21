class Solution {
    public boolean exist(char[][] board, String word) {
        boolean visited[][] = new boolean[board.length][board[0].length];

        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[i].length; j++)
            {
                if(wordsearch(board, i, j, word, 0, visited))
                {
                    return true;
                }
            }
        }
        return false;
    }

    boolean wordsearch(char[][] board, int row, int col, String word, int index, boolean visited[][])
    {
        if(row >= board.length || col >= board[0].length || row < 0 || col < 0 || index >= word.length() || board[row][col] != word.charAt(index) || visited[row][col])
        {
            return false;
        }

        visited[row][col] = true;

        if(board[row][col] == word.charAt(index) && index == word.length()-1)
        {
            return true;
        }

        boolean result = wordsearch(board, row+1, col, word, index+1, visited) ||
                         wordsearch(board, row-1, col, word, index+1, visited) ||
                         wordsearch(board, row, col+1, word, index+1, visited) ||
                         wordsearch(board, row, col-1, word, index+1, visited);
        
        visited[row][col] = false;
        return result;
    }
}