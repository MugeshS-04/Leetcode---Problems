class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1)
        {
            return nums[0];
        }
        return binary(nums, 0, nums.length-1);
    }

    public int binary(int[] nums, int left, int right)
    {
        if(left == right)
        {
            return nums[left];
        }

        int mid = left + (right - left)/2;

       if(nums[mid] < nums[right])
       {
            return binary(nums, left, mid);
       }
       else
       {
            return binary(nums, mid+1, right);
       }
    }
}