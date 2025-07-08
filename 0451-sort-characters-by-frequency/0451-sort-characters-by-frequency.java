class Solution {
    public String frequencySort(String s) {
        HashMap <Character, Integer> myhash = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
            myhash.put(s.charAt(i), myhash.getOrDefault(s.charAt(i), 0)+1);
        }

        PriorityQueue <Character> myq = new PriorityQueue<>((a, b) -> myhash.get(b) - myhash.get(a));

        for(char key : myhash.keySet())
        {
            myq.add(key);
        }

        StringBuilder result = new StringBuilder();

        while(!myq.isEmpty())
        {
            char ch = myq.poll();
            //System.out.println(myhash.get(ch));
            for(int i = 0; i < myhash.get(ch); i++)
            {
                result.append(ch);
            }
        }

        return result.toString();
    }
}