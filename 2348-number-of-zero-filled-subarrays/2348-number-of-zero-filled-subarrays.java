class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long result = 0;
        int start = 0;
        int end = 0;
        int c = 0;

        while(end < nums.length)
        {
            int count = 0;
            if(nums[end] == 0)
            {
                start = end;
                while(end < nums.length && nums[end] == 0)
                {
                    count++;
                    end++;
                }
                //System.out.println(count+" "+end);
                result += fact(count);
                if(count%2 == 0) c++;
                continue;
            }
            end++;
        }
        //result+=zerocount;
        return result+c;
    }

    int fact(int num)
    {
        int fact = 1;
        for(int i = 1; i <= num; i++)
        {
            fact*=i;
        }

        System.out.println(num+" "+fact);

        return fact;
    }
}