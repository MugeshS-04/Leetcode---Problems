class Solution {
    public boolean checkValid(int[][] matrix) {

        int sum = 0;

        for(int i = 1; i <= matrix.length; i++)
        {
            sum += i;
        }

        for(int i = 0; i < matrix.length; i++)
        {
            int tempsum = 0;

            for(int j = 0; j < matrix[0].length; j++)
            {
                tempsum += matrix[i][j];
            }

            if(tempsum != sum)
            {
                return false;
            }
        }

        return true;
    }
}