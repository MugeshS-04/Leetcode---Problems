class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];

        for(int i = 0; i < n+1; i++)
        {
            int val = i;
            int count = 0;
            while(val != 0)
            {
                val &= val-1;
                count++;
            }
            ans[i] = count;
        }

        return ans;
    }
}