class Solution {
    public int findDuplicate(int[] nums) {
        //cyclic sort

        int index = 0;

        while(index < nums.length)
        {
            if(nums[index] != nums[nums[index] - 1])
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
                return nums[i];
            }
        }

        return -1;
    }

    void swap(int nums[], int a, int b)
    {
        int temp =  nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}