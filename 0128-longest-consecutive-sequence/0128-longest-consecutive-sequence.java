class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> myset = new HashSet<>();

        int max = 0;

        for(int i = 0; i < nums.length; i++)
        {
            myset.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(!myset.contains(nums[i]-1))
            {
                int count = 0;
                int val = nums[i];
                while(myset.contains(val))
                {
                    val++;
                    count++;
                }
                max = Math.max(max, count);
            }
        }

        return max;
    }
}