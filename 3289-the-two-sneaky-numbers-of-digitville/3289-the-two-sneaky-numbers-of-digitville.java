class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> mylist = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] == nums[i-1])
            {
                mylist.add(nums[i]);
            }
        }

        int size = mylist.size();
        int result[] = new int[size];

        int index = 0;

        for(int val : mylist)
        {
            result[index++] = val;
        }

        return result;
    }
}