class Solution {
    public int maxSum(int[] nums) {
        int max = nums[0];
        HashSet <Integer> myset = new HashSet<>();
        myset.add(nums[0]);


        for(int val : nums)
        {
            if(!myset.contains(val))
            {
                max = Math.max(Math.max(val, max), max+val);
            }
            myset.add(val);
        }

        return max;

    }
}