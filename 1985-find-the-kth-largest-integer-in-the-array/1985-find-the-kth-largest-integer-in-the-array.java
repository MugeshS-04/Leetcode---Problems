class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> myq = new PriorityQueue<>((a,b) -> {
            if(a.length() > b.length()) 
            {
                return -1;
            }
            else if(a.length() == b.length())
            {
                if(a.equals(b)) 
                {
                    return 0;
                }
                else
                {
                    int start = 0;

                    while(start < a.length())
                    {
                        if(a.charAt(start) > b.charAt(start))
                        {
                            return -1;
                        }
                        else if(a.charAt(start) < b.charAt(start))
                        {
                            return 1;
                        }

                        start++;
                    }

                    return 0;
                }
            }
            else 
            {
                return 1;
            }
        });

        for(int i = 0; i < nums.length; i++)
        {
            myq.add(nums[i]);
        }

        int index = 0;
        
        while(index+1 != k)
        {
            myq.poll();
            index++;
        }

        return myq.poll();
    }
}