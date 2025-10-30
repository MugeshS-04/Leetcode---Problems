class Solution {
    public int countValidSelections(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                int sum1 = 0;
                int sum2 = 0;

                for(int j = i; j >= 0; j--)
                {
                    sum1 += nums[j];
                }

                for(int j = i; j < nums.length; j++)
                {
                    sum2 += nums[j];
                }

                if(sum1 == sum2){
                    count+=2;
                }
                else if(sum1 - 1 == sum2 || sum2 - 1 == sum1)
                {
                    count++;
                }
                
            }

        }

        return count;
    }
}