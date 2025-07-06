class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> myhash = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            myhash.put(nums[i], myhash.getOrDefault(nums[i], 0)+1);
        }

        PriorityQueue <Integer> myq = new PriorityQueue<>((a,b) -> myhash.get(a) - myhash.get(b));
        
        for(int val : myhash.keySet())
        {
            myq.add(val);
            if(myq.size() > k)
            {
                myq.poll();
            }
        }

        int arr[] = new int[k];

        for(int i = 0; i < k; i++)
        {
            arr[i] = myq.poll();
        }

        return arr;

        
    }
}