class Solution {
    public int searchInsert(int[] nums, int target) {
        int right = nums.length-1;
        int left = 0;
        return binarysearch(nums, target, left, right);
    }

    public int binarysearch(int[] nums,int target,int left,int right)
    {
        if(left > right)
        {
            return left;
        }
        int mid = left + (right - left)/2;

        if(nums[mid] == target)
        {
            return mid;
        }

        if(nums[mid] > target)
        {
            return binarysearch(nums, target, left, mid-1);
        }
        else
        {
            return binarysearch(nums, target, mid+1, right);
        }
    }
}