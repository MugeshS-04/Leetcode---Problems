class Solution {
    public int hIndex(int[] cit) {
        Arrays.sort(cit);


        for(int i = cit[cit.length-1]; i >= 0; i--)
        {
            int count = 0;
            for(int j = cit.length-1; j >= 0; j--)
            {
                if(cit[j] >= i)
                {
                    count++;
                }
            }

            if(count >= i)
            {
                return i;
            }
        }

        return 0;
    }
}