class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue <Integer> myq = new PriorityQueue<>();
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                myq.add(matrix[i][j]);
            }
        }
        int i = 0;
        int a = 0;
        while(i != k)
        {
            a = myq.poll();
            i++;
        }
        return a;
    }
}