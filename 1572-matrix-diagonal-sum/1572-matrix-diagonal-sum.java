class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;

        int r1 = 0;
        int r2 = mat[0].length-1;

        int c1 = 0;
        int c2 = 0;
        int mid = 0;

        while(r1 < mat.length && r2 > -1)
        {
            if(r1 == r2)
            {
                mid = r1;
            }
            sum+=mat[r1++][c1++];
            sum+=mat[r2--][c2++];
        }

        if(mat[0].length % 2 != 0)
        {
            return sum - mat[mid][mid];
        }
        return sum;
    }
}