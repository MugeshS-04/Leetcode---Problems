class Solution {
    public int uniquePathsWithObstacles(int[][] ob) {
        int row = ob.length;
        int col = ob[0].length;
        int dp[][] = new int[row+1][col+1];

        for(int i = 0; i < row; i++)
        {
            if(ob[i][0] != 1)
            {
                dp[i][0] = 1;
            }
            else
            {
                break;
            }
        }
        for(int i = 0; i < col; i++)
        {
            if(ob[0][i] != 1)
            {
                dp[0][i] = 1;
            }
            else
            {
                break;
            }
        }

        for(int i = 1; i < row; i++)
        {
            for(int j = 1; j < col; j++)
            {
                if(ob[i][j] != 1)
                {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }

        return dp[row-1][col-1];
    }
}