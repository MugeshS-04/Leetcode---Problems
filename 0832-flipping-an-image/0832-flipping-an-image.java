class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        flip(image);
        invert(image);
        return image;
    }

    void flip(int[][] image)
    {
        for(int i = 0; i < image.length; i++)
        {
            int left = 0;
            int right = image[i].length-1;

            while(left < right)
            {
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;

                left++;
                right--; 
            }
        }
    }

    void invert(int[][] image)
    {
        for(int i = 0; i < image.length; i++)
        {
            for(int j = 0; j < image[0].length; j++)
            {
                if(image[i][j] == 1)
                {
                    image[i][j] = 0;
                }
                else
                {
                    image[i][j] = 1;
                }
            }
        }
    }
}