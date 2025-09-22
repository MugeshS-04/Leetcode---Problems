class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> myhash = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            myhash.put(nums[i], myhash.getOrDefault(nums[i], 0) + 1);
        }

        int max = 0;
        int count = 0;

        for(int key : myhash.keySet())
        {
            if(myhash.get(key) > max)
            {
                max = myhash.get(key);
            }
        }

        for(int key : myhash.keySet())
        {
            if(myhash.get(key) == max)
            {
                count += myhash.get(key);
            }
        }

        return count;


    }
}