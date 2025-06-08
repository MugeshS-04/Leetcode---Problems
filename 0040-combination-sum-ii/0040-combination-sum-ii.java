class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> current = new ArrayList();
        Arrays.sort(candidates);
        combinate(result, current, candidates, target, 0);
        return result;
    }

    void combinate(List<List<Integer>> result, List<Integer> current, int[] cand, int target, int index)
    {
        if(target == 0)
        {
            result.add(new ArrayList(current));
            return;
        }

        for(int i = index; i < cand.length; i++)
        {
            if(i == index || cand[i] != cand[i - 1] && target - cand[i] >=0)
            {
                current.add(cand[i]);
                combinate(result, current, cand, target - cand[i], i+1);
                current.remove(current.size() - 1);
            } 
        }
    }
}