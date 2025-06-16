class Solution {
    public String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        char[][] mat = new char[numRows][s.length()];

        int row = 0;
        int col = 0;
        int index = 0;

        while(index < s.length())
        {
            while(index < s.length() && row < numRows)
            {
                mat[row][col] = s.charAt(index);
                row++;
                index++;
            }

            row = Math.max(0, row - 2);
            col++;

            while(index < s.length() && row > 0)
            {
                mat[row][col] = s.charAt(index);
                index++;
                row--;
                col++;
            }
        }

        for(int i = 0; i < numRows; i++)
        {
            for(int j = 0; j < mat[0].length; j++)
            {
                if(mat[i][j] != 0)
                    sb.append(mat[i][j]);
            }
        }

        return sb.toString();
    }
}