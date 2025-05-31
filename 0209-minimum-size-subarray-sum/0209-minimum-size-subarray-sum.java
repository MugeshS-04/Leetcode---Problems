class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int cursum = nums[0];
        int curlen = 1;
        int minlen = nums.length;
        boolean mark = false;
        int start = 0;
        int end = 1;

        while(end < nums.length)
        {
            if(cursum < target)
            {
                cursum = cursum + nums[end++];
                curlen++;
            }
            else
            {
               minlen = Math.min(minlen, curlen);
               curlen--;
               cursum = cursum-nums[start++]; 
               mark = true;
            }
        }
        
        if(cursum >= target)
        {
            minlen = Math.min(curlen, minlen);
            mark = true;
        }

        while(start < nums.length)
        {
            if(cursum - nums[start] >= target)
            {
                curlen--;
                minlen = Math.min(curlen, minlen);
                cursum-=nums[start++];
            }
            else
            {
                break;
            }
        }

        return minlen == nums.length && mark == false? 0 : minlen;
    }
}