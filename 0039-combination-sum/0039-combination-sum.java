class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> current = new ArrayList();
        combinate(candidates, target, result, current, 0);
        return result;
    }

    void combinate(int[] cand, int target, List<List<Integer>> result, List<Integer> current, int index)
    {
        if(target == 0)
        {
            result.add(new ArrayList(current));
            return;
        }

        for(int i = index; i < cand.length; i++)
        {
            if(target - cand[i] >= 0)
            {
                current.add(cand[i]);
                combinate(cand, target - cand[i], result, current, i);
                current.remove(current.size() - 1);
            } 
        }
    }
}