class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        int dp[][] = new int[numRows][];

        for(int i = 0; i < numRows; i++)
        {
            dp[i] = new int[i+1];
        }

        dp[0][0] = 1;

        for(int i = 1; i < numRows; i++)
        {
            dp[i][0] = 1;
            dp[i][i] = 1;

            int row = i;
            int col = 1;

            for(int j = 0; j < i-1; j++)
            {
                dp[row][col++] = dp[i-1][j] + dp[i-1][j+1];
            }
        }

        for(int i = 0; i < numRows; i++)
        {
            List <Integer> current = new ArrayList<>();
            for(int j = 0; j < dp[i].length; j++)
            {
                current.add(dp[i][j]);
            }
            result.add(new ArrayList(current));
        }

        return result;

    }
}