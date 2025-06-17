class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int total = matrix[0].length * matrix.length;
        List<Integer> result = new ArrayList();

        int top = 0;
        int down = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while(top <= down && left <= right)
        {
            for(int col = left; col <= right; col++)
            {
                result.add(matrix[top][col]);
            }
            top++;

            for(int row = top; row <= down; row++)
            {
                result.add(matrix[row][right]);
            }
            right--;

            if(top <= down)
            {
                for(int col = right; col >= left; col--)
                {
                    result.add(matrix[down][col]);
                }
                down--;
            }
            
            if(right <= left)
            {
                for(int row = down; row >= top; row--)
                {
                    result.add(matrix[row][left]);
                }
                left++;
            }
            
        }

        return result;
    }
}