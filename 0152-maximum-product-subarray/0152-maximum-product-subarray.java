class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];

        for(int i = 1; i < nums.length; i++)
        {
            int cur = nums[i];

            int temp = max;

            max = Math.max(cur, Math.max(cur*max, cur*min));
            min = Math.min(cur, Math.min(cur*temp, cur*min));

            res = Math.max(res, max);
        }

        return res;
    }
}