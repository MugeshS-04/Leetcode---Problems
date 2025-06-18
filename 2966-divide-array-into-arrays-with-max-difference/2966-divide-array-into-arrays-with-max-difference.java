class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int result[][] = new int[(nums.length/3)][3];
        int m = 0;
        for(int i = 0; i < nums.length; i+=3)
        {
            if(nums[i] - nums[i+1] <= k && nums[i+1] - nums[i+2] <= k && nums[i+2] - nums[i] <=k)
            {
                int arr[] = new int[3];
                arr[0] = nums[i];
                arr[1] = nums[i+1];
                arr[2] = nums[i+2];
                result[m++] = arr;
            }
            else
            {
                return new int[0][0];
            }
        }

        return result;
    }
}