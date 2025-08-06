class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(nums);
        Set<String> myset = new HashSet();
        for(int i = 0; i < nums.length-2; i++)
        {
            for(int j = i+1; j < nums.length-1; j++)
            {
                for(int k = j+1; k < nums.length; k++)
                {
                    if(nums[i] + nums[j] + nums[k] == 0)
                    {
                        List<Integer> mylist = new ArrayList();
                        mylist.add(nums[i]);
                        mylist.add(nums[j]);
                        mylist.add(nums[k]);
                        if(!myset.contains(nums[i]+" "+nums[j]+" "+nums[k]))
                        {
                            result.add(new ArrayList(mylist));
                        }
                        myset.add(nums[i]+" "+nums[j]+" "+nums[k]);
                    }
                }
            }
        }
        return result;
    }
}