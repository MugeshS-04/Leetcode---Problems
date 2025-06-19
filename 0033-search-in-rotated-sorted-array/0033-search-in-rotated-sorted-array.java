class Solution {
    public int search(int[] nums, int target) {
        return binarysearch(nums, target, 0, nums.length-1);
    }

    int binarysearch(int[] nums, int target, int left, int right)
    {
        if(left > right)
        {
            return -1;
        }

        int mid = left + (right - left)/2;

        if(nums[mid] == target)
        {
            return mid;
        }

        if(nums[left] <= nums[mid])
        {
            if(target >= nums[left] && target <= nums[mid])
            {
                return binarysearch(nums, target, left, mid-1);
            }
            else
            {
               return binarysearch(nums, target, mid+1, right);
            }
        }
        else
        {
            if(target >= nums[mid] && target <= nums[right])
            {
                return binarysearch(nums, target, mid+1, right);
            }
            else
            {
               return binarysearch(nums, target, left, mid-1);
            }
        }
    }
}