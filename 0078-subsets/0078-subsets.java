class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> empty = new ArrayList();
        result.add(new ArrayList(empty));
        subset(result, new ArrayList(), nums, 0);
        return result;
    }

    void subset(List<List<Integer>> result, List<Integer> current, int[] nums, int index)
    {
        for(int i = index; i < nums.length; i++)
        {
            current.add(nums[i]);
            result.add(new ArrayList(current));
            subset(result, current, nums, i+1);
            current.remove(current.size() - 1);
        }
    }
}