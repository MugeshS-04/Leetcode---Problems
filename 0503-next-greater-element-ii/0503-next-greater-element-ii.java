class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int arr[] = new int[nums.length + nums.length];
        int k = 0;

        for(int i = 0; i < nums.length; i++)
        {
            arr[k++] = nums[i];
        }
        
        for(int i = 0; i < nums.length; i++)
        {
            arr[k++] = nums[i];
        }

        int flag = 0;

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[j] > nums[i])
                {
                    nums[i] = arr[j];
                    flag = 1;
                    break;
                }
            }

            if(flag == 0)
            {
                nums[i] = -1;
            }
            else
            {
                flag = 0;
            }
        }

        return nums;
    }
}