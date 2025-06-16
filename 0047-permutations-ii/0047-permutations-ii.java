class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> current = new ArrayList();
        Arrays.sort(nums);
        boolean used[] = new boolean[nums.length];
        permute(result, current, nums, used);
        return result;
    }

    public void permute(List<List<Integer>> result, List<Integer> current, int[] nums, boolean[] used)
    {
        if(current.size() == nums.length)
        {
            result.add(new ArrayList(current));
            return;
        }


        for(int i = 0; i < nums.length; i++)
        {
            if(used[i])
            {
                continue;
            }

            if(i > 0 && nums[i] == nums[i-1] && !used[i-1])
            {
                continue;
            }

            used[i] = true;
            current.add(nums[i]);
            permute(result, current, nums, used);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}