class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> myhash = new HashSet<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(myhash.contains(nums[i]))
            {
                return true;
            }
            myhash.add(nums[i]);
        }

        return false;
    }
}