class Solution {
    public int longestSubarray(int[] nums) {
        
        int end = 0;
        int cursum = 0;
        int max = 0;

        int prev = -1;

        boolean mark = false;

        while(end < nums.length)
        {
            if(nums[end] != 0)
            {
                cursum+=1;
                end++;
                max = Math.max(max, cursum);
            }
            else
            {
                max = Math.max(max, cursum);
                if(mark)
                {
                    cursum = 0;
                    end = prev+1;
                    mark = false;
                }
                else
                {
                    prev = end;
                    end++;
                    mark = true;
                }
            }
        }

        if(max == nums.length) max-=1;

        return max;
    }
}