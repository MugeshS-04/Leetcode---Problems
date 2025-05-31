class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int cursum = 0;
        int minlen = nums.length+1;

        for(int r = 0; r < nums.length; r++)
        {
            cursum+=nums[r];

            while(cursum >= target)
            {
                System.out.println(l+" "+r);
                minlen = Math.min(minlen, r-l+1);
                cursum = cursum - nums[l];
                l++;
            }
        }
        return minlen == nums.length+1 ? 0 : minlen;
    }   
}
