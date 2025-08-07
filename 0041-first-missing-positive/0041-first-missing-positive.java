class Solution {
    public int firstMissingPositive(int[] nums) {
        //cyclic sort

        int index = 0;

        while(index < nums.length)
        {
            if(nums[index] > 0 && nums[index] < nums.length && nums[index] != nums[nums[index] - 1])
            {
                swap(nums, index, nums[index] - 1);
            }
            else
            {
                index++;
            }
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != i+1)
            {
                return i+1;
            }
        }

        return nums[nums.length-1] + 1;
    }

    void swap(int nums[], int a, int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}