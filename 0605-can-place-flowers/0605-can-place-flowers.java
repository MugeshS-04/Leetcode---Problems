class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i < flowerbed.length; i++)
        {
            if(n == 0) return true;
            
            if(i == 0)
            {
                if(flowerbed[i] != 1 && i+1 >= flowerbed.length) n--;
                else if(flowerbed[i] != 1 && flowerbed[i+1] != 1)
                {
                    flowerbed[i] = 1;
                    n--;
                }
            }
            else if(i == flowerbed.length-1)
            {
                if(flowerbed[i] != 1 && i-1 <= -1) n--;
                else if(flowerbed[i] != 1 && flowerbed[i-1] != 1)
                {
                    flowerbed[i] = 1;
                    n--;
                }
            }
            else
            {
                if(flowerbed[i-1] != 1 && flowerbed[i] != 1 && flowerbed[i+1] != 1)
                {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        if(n == 0) return true;
        return false;
    }
}