class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int arr[] = new int[n*n];
        int m = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                arr[m] = matrix[i][j];
                m++;
            }
        }
        for(int i = 0; i < matrix.length*n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int i = 0; i < matrix.length*n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        return arr[k-1];
    }
}