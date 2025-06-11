class Solution {
    public List<Integer> lexicalOrder(int n) {
        List <Integer> result = new ArrayList();

        for(int i = 1; i <=9; i++)
        {
            dfs(i, n, result);
        }

        return result;
    }

    void dfs(int cur, int n, List <Integer> result)
    {
        if(cur > n)
        {
            return;
        }
        result.add(cur);

        for(int i = 0; i <=9; i++)
        {
            int next = i + 10 * cur;
            if(next > n)
            {
                return;
            }
            dfs(next , n, result);
        }
    }
}