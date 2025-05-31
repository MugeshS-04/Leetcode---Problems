class Solution {
    public int maxProfit(int[] prices) {
        int diff = prices[0];
        int maxdiff = 0;
        for(int i = 0; i < prices.length; i++)
        {
                if(prices[i] < diff)
                {
                    diff = prices[i];
                }
                else
                {
                    maxdiff = Math.max(maxdiff, prices[i] - diff);
                }
        }
        return maxdiff;
    }
}