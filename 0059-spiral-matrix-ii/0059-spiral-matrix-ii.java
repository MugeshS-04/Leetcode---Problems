class Solution {
    public int[][] generateMatrix(int n) {
        int mat[][] = new int[n][n];

        int row = 0;
        int col = 0;

        int top = 0;
        int down = n-1;
        int left = 0;
        int right = n-1;

        int size = n * n;

        int index = 1;

        while(index <= size)
        {
            while(col <= right)
            {
                mat[row][col++] = index++;
            }

            col--;
            row++;

            while(row <= down)
            {
                mat[row++][col] = index++;
            }

            row--;
            col--;

            while(col >= left)
            {
                mat[row][col--] = index++;
            }

            col++;
            row--;
            top++;
            right--;

            while(row >= top)
            {
                mat[row--][col] = index++;
            }

            row++;
            down--;
            col++;
            left++;
        }

        return mat;
    }
}