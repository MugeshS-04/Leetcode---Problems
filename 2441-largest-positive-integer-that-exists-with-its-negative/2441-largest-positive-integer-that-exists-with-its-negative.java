class Solution {
    public int findMaxK(int[] nums) {
        HashSet <Integer> myhash = new HashSet<>();

        int max = -1;

        for(int i = 0; i < nums.length; i++)
        {
            int num = -1 * nums[i];
            if(myhash.contains(num))
            {
                max = Math.max(max, Math.abs(num));
            }
            else
            {
                myhash.add(nums[i]);
            }
        }

        return max;
    }
}