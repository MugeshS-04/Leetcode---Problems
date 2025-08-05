class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;
        for(int i = 0; i < fruits.length; i++)
        {
            for(int j = 0; j < baskets.length; j++)
            {
                if(baskets[j] >= fruits[i])
                {
                    baskets[j] = Integer.MIN_VALUE;
                    break;
                }

                if(j == baskets.length-1)
                {
                    count++;
                }
            }
        }

        return count;
    }
}