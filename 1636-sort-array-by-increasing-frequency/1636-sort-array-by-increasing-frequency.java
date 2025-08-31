class Solution {
    public int[] frequencySort(int[] nums) {
        int[] result = new int[nums.length];

        HashMap<Integer, Integer> myhash = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            myhash.put(nums[i], myhash.getOrDefault(nums[i], 0)+1);
        }

        PriorityQueue<Integer> myq = new PriorityQueue<>((a,b) -> myhash.get(a) == myhash.get(b) ? b - a : myhash.get(a) - myhash.get(b));

        for(int val : myhash.keySet())
        {
            myq.add(val);
        }

        int index = 0;

        while(!myq.isEmpty())
        {
            int size = myhash.get(myq.peek());

            for(int i = 0; i < size; i++)
            {
                result[index++] = myq.peek();
            } 

            myq.poll();
        }

        return result;
    }
}