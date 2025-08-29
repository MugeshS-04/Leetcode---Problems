class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        int row = 0;

        for(int i = 0; i < nums.length; i++)
        {
            int val = nums[i];
            row = i;

            for(int j = i; j < nums.length; j++)
            {
                if(nums[j] < val) 
                {
                    val = nums[j];
                    row = j;
                }
            }

            if(i%2 == 0) 
            {
                arr[i+1] = val;
            }
            else
            {
                arr[i-1] = val;
            }

            int temp = nums[row];
            nums[row] = nums[i];
            nums[i] = temp;
        }

        return arr;
    }
}