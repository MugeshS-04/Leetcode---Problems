class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList();
        combinate(result, new ArrayList(), n, k, 1);
        return result;
    }

    void combinate(List<List<Integer>> result, List<Integer> current, int n, int k, int index)
    {
        if(current.size() == k)
        {
            result.add(new ArrayList(current));
            return;
        }

        for(int i = index; i <= n; i++)
        {
            if(!current.contains(i))
            {
                current.add(i);
                combinate(result, current, n, k, i+1);
                current.remove(current.size() - 1);
            }
        }
    }
}