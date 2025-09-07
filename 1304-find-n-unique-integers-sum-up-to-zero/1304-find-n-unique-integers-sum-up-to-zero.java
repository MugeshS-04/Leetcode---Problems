class Solution {
    public int[] sumZero(int n) {
        int p = 1;
        int ne = -1;

        int arr[] = new int[n];

        if(n % 2 == 0)
        {
            for(int i = 0; i < n; i++)
            {
                if(i % 2 == 0) arr[i] = p++;
                else arr[i] = ne--;
            }
        }
        else
        {
            arr[0] = 0;

            for(int i = 1; i < n; i++)
            { 
                if(i % 2 == 0) arr[i] = p++;
                else arr[i] = ne--;
            }

        }

        return arr;

    }
}