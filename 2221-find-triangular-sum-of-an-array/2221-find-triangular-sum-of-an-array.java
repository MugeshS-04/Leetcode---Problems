class Solution {
    public int triangularSum(int[] nums) {
        int size = nums.length;

        if(size == 1)
        {
            return nums[0];
        }

        while(size != 1)
        {
            for(int i = 0; i < size-1; i++)
            {
                nums[i] = (nums[i] + nums[i+1]) % 10;
            }
            size--;
        }

        return nums[0];
    }
}