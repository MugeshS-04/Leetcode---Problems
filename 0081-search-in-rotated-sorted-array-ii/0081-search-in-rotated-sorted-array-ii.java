class Solution {
    public boolean search(int[] nums, int target) {
        return bs(nums, target, 0, nums.length-1);
    }

    boolean bs(int[] nums, int target, int left, int right)
    {
        if(left > right)
        {
            return false;
        }

        int mid = left + (right - left)/2;

        if(nums[mid] == target)
        {
            return true;
        }

        if(nums[left] <= nums[mid])
        {
            if(target <= nums[mid] && target >= nums[left])
            {
                return bs(nums, target, left, mid-1);
            }
            else
            {
                return bs(nums, target, mid+1, right);
            }
        }
        else
        {
            if(target <= nums[right] && target >= nums[mid])
            {
                return bs(nums, target, mid+1, right);
            }
            else
            {
                return bs(nums, target, left, mid-1);
            }
        }
    }
}