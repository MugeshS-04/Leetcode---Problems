class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
        Arrays.sort(nums);
        int result[] = new int[2];
        int index = 0;

        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] == nums[i-1])
            {
                result[index++] = nums[i];
            }
        }

        return result;
    }
}