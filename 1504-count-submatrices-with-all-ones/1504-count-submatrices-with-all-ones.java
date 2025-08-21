class Solution {
    public int numSubmat(int[][] matrix) {
        int[][] dp1 = new int[matrix.length][matrix[0].length];
        int count = 0;

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(matrix[i][j] == 1)
                {
                    if(j == 0)
                    {
                        dp1[i][j] = 1;
                    }
                    else
                    {
                        dp1[i][j] = dp1[i][j-1] + 1;
                    }
                    int minwidth = dp1[i][j];
                    for(int k = i; k >= 0; k--)
                    {
                        if(dp1[k][j] > 0)
                        {
                            minwidth = Math.min(minwidth, dp1[k][j]);
                            count+=minwidth;
                        }
                        else break;
                    }
                } 
            }
            
        }

        return count;
    }
}