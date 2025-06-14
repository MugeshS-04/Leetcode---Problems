class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int buy = prices[0];
        int sell;

        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] < buy)
            {
                buy = prices[i];
            }
            else
            {
                max_profit = Math.max(max_profit, prices[i] - buy);
            }
        }

        return max_profit;
    }
}