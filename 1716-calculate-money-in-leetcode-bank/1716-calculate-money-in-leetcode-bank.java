class Solution {
    public int totalMoney(int n) {
        int result = 0;
        
        if(n <= 7)
        {
            for(int i = 0; i <= n; i++)
            {
                result += i;
            }

            return result;
        }

        int ind = 1;
        int i = 1; 

        while(i <= n)
        {
            for(int j = ind; j < ind + 7; j++)
            {
                result += j;
                if(i == n) return result;
                i++;
            }

            ind++;
        }

        return 0;
    }
}