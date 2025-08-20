class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result = 0;

        for(int i = left; i <= right; i++)
        {
            int n = i;
            int count = 0;

            while(n != 0)
            {
                if((n & 1) == 1) count++;
                n = n >>> 1;
            }

            System.out.println(i+" "+count);

            if(prime(count))
            {
                result++;
            }
        }

        return result;
    }

    boolean prime(int val)
    {
        if(val <= 1) return false;

        for(int i = 2; i < val; i++)
        {
            if(val % i == 0) return false;
        }
        return true;
    }
}