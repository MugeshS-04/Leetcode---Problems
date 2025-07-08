class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = 0;

       if(nums.length <= 2)
       {
        return nums[0];
       }
       else
       {
        for(int i = 0; i < n; i+=2)
        {
            max += nums[i];
        }
        return max;
       }
    }
}