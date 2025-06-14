class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int tot = 0;
        int maxsum = nums[0];
        int minsum = nums[0];
        int curmax = 0;
        int curmin = 0;

        for(int i: nums)
        {
            tot+=i;
            curmax = Math.max(i, i+curmax);
            curmin = Math.min(i, i+curmin);
            maxsum = Math.max(maxsum, curmax);
            minsum = Math.min(minsum, curmin);
        }

        return maxsum > 0 ? Math.max(maxsum, tot - minsum) : maxsum;
    }
}