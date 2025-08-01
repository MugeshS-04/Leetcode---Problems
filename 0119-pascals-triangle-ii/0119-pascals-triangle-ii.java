class Solution {
    public List<Integer> getRow(int rowIndex) {
        int dp[][] = new int[rowIndex+1][];

        for(int i = 0; i <= rowIndex; i++)
        {
            dp[i] = new int[i+1];
        }

        dp[0][0] = 1;

        for(int i = 1; i <= rowIndex; i++)
        {
            dp[i][0] = 1;
            dp[i][i] = 1;

            int col = 1;

            for(int j = 0; j < i - 1; j++)
            {
                dp[i][col++] = dp[i-1][j] + dp[i-1][j+1];
            }
        }

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < dp[rowIndex].length; i++)
        {
            result.add(dp[rowIndex][i]);
        }

        return result;
    }
}