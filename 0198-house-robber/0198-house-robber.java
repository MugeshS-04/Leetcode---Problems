class Solution {
    public int rob(int[] nums) {
        int first = 0;
        int second = 0;

        int index = 0;

        while(index < nums.length)
        {
            if(index % 2 == 0)
            {
                second+=nums[index];
            }
            else
            {
                first+=nums[index];
            }

            index++;
        }

        if(first == second && first != 0)
        {
            return first+1;
        }

        return first > second ? first : second;
    }
}