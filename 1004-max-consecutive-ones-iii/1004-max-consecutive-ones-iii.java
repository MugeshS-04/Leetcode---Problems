class Solution {
    public int longestOnes(int[] nums, int k) {

        int start = 0;
        int end = 0;

        int max_count = 0;
        int count = 0;
        int k_count = 0;

        while(end < nums.length)
        {
            if(nums[end] == 1)
            {
                count++;
                max_count = Math.max(max_count, count);
                System.out.println(start+" - "+end+" -> "+count+" = "+max_count);
                end++;
            }
            else
            {
                if(k_count < k)
                {
                    k_count++;
                    count++;
                    max_count = Math.max(max_count, count);
                    System.out.println(start+" - "+end+" -> "+count+" = "+max_count);
                    end++;
                }
                else
                {
                    max_count = Math.max(max_count, count);

                    while(start < end && nums[start] == 1)
                    {
                        start++;
                        count--;
                    }

                    if(nums[start] == 0)
                    {
                        k_count--;
                        count--;
                        start++;
                    }

                }
                
                // System.out.println(start+" - "+end+" -> "+count+" = "+max_count);
            }

            max_count = Math.max(max_count, count);
        }

        return max_count;
    }
}