class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    int dfs(int[] nums, int index, int cur)
    {
        if(index == nums.length) return cur;

        int inc = dfs(nums, index+1, cur ^ nums[index]);
        int exe = dfs(nums, index+1, cur);

        return inc+exe;
    }
}