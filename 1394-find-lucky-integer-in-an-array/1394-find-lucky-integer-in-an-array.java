class Solution {
    public int findLucky(int[] arr) {
        PriorityQueue <Integer> myq = new PriorityQueue<>((a, b) -> b - a);

        myq.add(-1);

        HashMap <Integer, Integer> myhash = new HashMap<>();

        for(int i = 0; i < arr.length; i++)
        {
            myhash.put(arr[i], myhash.getOrDefault(arr[i], 0)+1);
        }

        for(Map.Entry <Integer, Integer> hash : myhash.entrySet())
        {
            System.out.println(hash.getKey());
            System.out.println(hash.getValue());
            if(hash.getKey() == hash.getValue())
            {
                myq.add(hash.getKey());
            }
        }

        return myq.poll();
    }
}