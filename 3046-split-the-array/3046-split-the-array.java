class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int arr[] = new int[101];

        for(int i = 0; i < nums.length; i++)
        {
            if(arr[nums[i]] >= 2)
            {
                return false;
            }
            arr[nums[i]]++;
        }

        return true;
    }
}