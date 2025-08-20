class Solution {
    public int countSquares(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        int count = 0;

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(matrix[i][j] == 1)
                {
                    if(i == 0 || j == 0)
                    {
                        dp[i][j] = 1;
                    }
                    else
                    {   
                        int min = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
                        dp[i][j] = min + 1;
                    }
                } 
                count+= dp[i][j];
            }
        }

        return count;
    }
}