class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row_size = mat.length;
        int col_size = mat[0].length;

        int[] result = new int[row_size * col_size];

        int index = 0;

        int row = 0;
        int col = 0;

        while(index < result.length)
        {
            //top-movement
            while(index < result.length && row >= 0 && col < col_size)
            {
                result[index++] = mat[row][col];
                row--;
                col++;
            }

            row++;

            if(col == col_size) 
            {
                row++;
                col--;
            }
            
            //down-movement
            while(index < result.length && row < row_size && col >= 0)
            {
                System.out.print(mat[row][col]+" ");
                result[index++] = mat[row][col];
                row++;
                col--;
            }

            col++;
            if(row == row_size)
            {
                col++;
                row--;
            }

        }

        return result;
    }
}