class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        subset(result, new ArrayList(), nums, 0);
        return result;
    }

    void subset(List<List<Integer>> result, List<Integer> current, int[] nums, int index)
    {

        result.add(new ArrayList(current));
        
        for(int i = index; i < nums.length; i++)
        {
            current.add(nums[i]);
            subset(result, current, nums, i+1);
            current.remove(current.size() - 1);
        }
    }
}