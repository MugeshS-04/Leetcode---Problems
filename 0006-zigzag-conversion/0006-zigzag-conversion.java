class Solution {
    public String convert(String s, int numRows) {
        char[][] str = new char[numRows][s.length()];

        int index = 0;
        int row = 0;
        int col = 0;

        while(index < s.length())
        {
            while(index < s.length() && row < numRows)
            {
                str[row++][col] = s.charAt(index++);
            }
            row = Math.max(0, row-2);
            col = col + 1;

            while(index < s.length() && row > 0)
            {
                str[row][col] = s.charAt(index++);
                col++;
                row--;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < numRows; i++)
        {
            for(int j = 0; j < s.length(); j++)
            {
                if(str[i][j] != 0)
                {
                    sb.append(str[i][j]);
                }
            }
        }

        return sb.toString();
    }
}