class Solution {
    public int countHillValley(int[] nums) {
        HashSet <Integer> myset = new HashSet<>();
        int index = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(myset.contains(nums[i]))
            {
                continue;
            }
            else
            {
                nums[index++] = nums[i];
                myset.add(nums[i]);
            }
        }

        for(int i = 1; i < index-1; i++)
        {
            if((nums[i-1] < nums[i] && nums[i+1] < nums[i]) || (nums[i] < nums[i-1] && nums[i] < nums[i+1]))
            {
                count++;
            }
        }

        return count;

    }
}