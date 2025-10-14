class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
       
        int start = 0;
        int end = k;

        while(end < nums.size())
        {
            if(check(nums, start, end))
            {
                if(check(nums, start + k, end + k)) return true;
            }

            start++;
            end++;
        }

        return false;
    }

    boolean check(List<Integer> mylist, int start, int end)
    {
        for(int i = start+1; i < end; i++)
        {
            if(i >= mylist.size() || mylist.get(i) <= mylist.get(i-1))
            {
                return false;
            }
        }

        return true;
    }
}