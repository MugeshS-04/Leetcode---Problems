class Solution {
    public int countPartitions(int[] nums) {
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];

        for(int i = 1; i < nums.length; i++)
        {
            prefix[i] = prefix[i-1] + nums[i];
        }

        int count = 0;

        for(int i = 1; i < nums.length; i++)
        {
            if(Math.abs(prefix[i] - (prefix[nums.length-1] - prefix[i])) % 2 == 0) count++;
        }

        return count;
    }
}