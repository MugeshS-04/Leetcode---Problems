class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        int temp[] = new int[nums.length];
        System.arraycopy(nums, 0, temp, 0, nums.length);

        Arrays.sort(nums);
        HashMap <Integer, Integer> myhash = new HashMap<>();

        for(int i = nums.length-k; i < nums.length; i++)
        {
            myhash.put(nums[i], myhash.getOrDefault(nums[i], 0) + 1);
        }

        int index = 0;
        int result[] = new int[k];
        for(int i = 0; i < nums.length; i++)
        {
            if(myhash.containsKey(temp[i]) && myhash.get(temp[i]) > 0)
            {
                result[index] = temp[i];
                index++;
                myhash.put(temp[i], myhash.get(temp[i]) - 1);
            }
        }
        return result;
    }
}