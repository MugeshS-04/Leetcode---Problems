class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cur = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                cur = 0;
            }    
            else
            {
                cur++;
                max = Math.max(cur, max);
            }
        }

        return max;
    }
}