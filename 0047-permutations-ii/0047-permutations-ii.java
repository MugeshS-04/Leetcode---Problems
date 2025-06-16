class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        boolean[] used = new boolean[nums.length];
        permutation(result, new ArrayList(), nums, used);
        return result;
    }

    void permutation(List<List<Integer>> result, List<Integer> current, int[] nums, boolean[] used)
    {
        if(current.size() == nums.length && !result.contains(current))
        {
            result.add(new ArrayList(current));
            return;
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(used[i] == false)
            {
                current.add(nums[i]);
                used[i] = true;
                permutation(result, current, nums, used);
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }
}