class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < k)
            {
                min(nums);
                count++;
                i--;
            }
        }
        return count;
    }

    void min(int[] nums)
    {
        int min = nums[0];
        int iter = 0;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] < min)
            {
                min = nums[i];
                iter = i;
            }
        }
        nums[iter] = Integer.MAX_VALUE;
    }
}