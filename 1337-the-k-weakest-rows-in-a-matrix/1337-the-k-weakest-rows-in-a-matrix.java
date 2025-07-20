class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int arr[] = new int[mat.length];
        int arr2[][] = new int[mat.length][2];
    

        for(int i = 0; i < mat.length; i++)
        {
            int m = 0;
            for(int j = 0; j < mat[0].length; j++)
            {
                if(mat[i][j] == 1)
                {
                    m++;
                }
            }
            arr[i] = m;
            arr2[i][0] = i;
            arr2[i][1] = m;
        }

        Arrays.sort(arr);

        int result[] = new int[k];

        for(int i = 0; i < k; i++)
        {
            for(int j = 0; j < arr2.length; j++)
            {
                if(arr[i] == arr2[j][1])
                {
                    result[i] = arr2[j][0];
                    arr2[j][1] = Integer.MAX_VALUE;
                    break;
                }
            }
        }
        
        return result;
    }
}