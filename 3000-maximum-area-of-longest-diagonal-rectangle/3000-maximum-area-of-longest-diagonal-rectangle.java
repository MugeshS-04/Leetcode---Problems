class Solution {
    public int areaOfMaxDiagonal(int[][] di) {
        double max = 0;
        int area = 0;

        for(int i = 0; i < di.length; i++)
        {
            double temp = Math.sqrt((di[i][0] * di[i][0]) + (di[i][1] * di[i][1]));

            if(temp == max)
            {
                if(di[i][0] * di[i][1] > area)
                {
                    area = di[i][0] * di[i][1];
                }
            }

            else if(temp > max)
            {
                max = temp;
                area = di[i][0] * di[i][1];
            }
        }

        return area;
    }
}