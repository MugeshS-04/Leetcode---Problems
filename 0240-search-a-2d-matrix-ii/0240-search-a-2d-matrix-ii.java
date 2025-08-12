class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length-1;
        int col = matrix[0].length-1;

        //row
        for(int i = 0; i <= row; i++)
        {
            if(matrix[i][0] == target || matrix[i][col] == target)
            {
                return true;
            }

            if(target > matrix[i][0] && target < matrix[i][col])
            {
                if(search(matrix, i, 0, col, target))
                {
                    return true;
                }
            }
        }

        return false;
    }

    boolean search(int[][] matrix, int row, int left, int right, int target)
    {
        if(left > right)
        {
            return false;
        }

        int mid = left + (right - left)/2;

        if(matrix[row][mid] == target)
        {
            return true;
        }

        if(matrix[row][mid] < target)
        {
            return search(matrix, row, mid+1, right, target);
        }
        else
        {
            return search(matrix, row, left, mid-1, target);
        }
    }
}