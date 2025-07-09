class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap <Integer, Integer> myhash = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            myhash.put(nums[i], myhash.getOrDefault(nums[i], 0)+1);
        }

        int tot = 0;

        for(int i : nums)
        {
            if(myhash.get(i) == 1)
            {
                tot+=i;
            }
        }

        return tot;
    }
}