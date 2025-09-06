class Solution {
    public int pivotIndex(int[] nums) {
        int pre[] = new int[nums.length];
        int suf[] = new int[nums.length];
        int sum = 0;

        for(int i = 0; i < nums.length; i++)
        {
            pre[i] = sum;
            sum += nums[i];
        }

        sum = 0;

        for(int i = nums.length-1; i >= 0; i--)
        {
            suf[i] = sum;
            sum += nums[i];
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(pre[i] == suf[i]) return i;
        }

        return -1;
    }
}