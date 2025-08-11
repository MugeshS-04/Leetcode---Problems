class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(nums, result, new ArrayList<>());
        return result;
    }

    void permutation(int[] nums, List<List<Integer>> result, List<Integer> current)
    {
        if(current.size() == nums.length)
        {
            result.add(new ArrayList(current));
            return;
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(!current.contains(nums[i]))
            {
                current.add(nums[i]);
                permutation(nums, result, current);
                current.remove(current.size() - 1);
            }
        }

        return;
    }
}