class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(candidates);
        backtrack(result, candidates, target, new ArrayList(), 0);
        return result;
    }

    public void backtrack(List<List<Integer>> result, int[] candidates, int target, List<Integer> current, int index)
    {
        if(target == 0)
        {
            result.add(new ArrayList(current));
            return;
        }
        for(int i = index; i < candidates.length; i++)
        {
            if(i > index && candidates[i] == candidates[i - 1])
            {
                continue;
            }

             if(candidates[i] > target)  
            {
                break;  
            }
            current.add(candidates[i]);
            backtrack(result, candidates, target - candidates[i], current, i+1);
            current.remove(current.size() - 1);
        }
    }
}