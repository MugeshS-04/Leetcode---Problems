class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> current = new ArrayList();
        combinate(result, current, k, n, 1);
        return result;
    }

    void combinate(List<List<Integer>> result, List<Integer> current, int k, int n, int index)
    {
        if(current.size() == k && n == 0)
        {
            result.add(new ArrayList(current));
            return;
        }

        for(int i = index; i <= 9; i++)
        {
            if(n - i >= 0)
            {
                current.add(i);
                combinate(result, current, k, n-i, i+1);
                current.remove(current.size() - 1);
            }
        }
    }
}