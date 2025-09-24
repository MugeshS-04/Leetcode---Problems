class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character, Integer> myhash = new HashMap<>();
        HashMap<Character, Integer> myhash2 = new HashMap<>();

        for(int i = 0; i < target.length(); i++)
        {
            myhash2.put(target.charAt(i), myhash2.getOrDefault(target.charAt(i), 0) + 1);
            myhash.put(target.charAt(i), 0);
        }

        for(int i = 0; i < s.length(); i++)
        {
            if(target.contains(s.charAt(i)+""))
            {
                myhash.put(s.charAt(i), myhash.getOrDefault(s.charAt(i), 0) + 1);
            }
        }

        int count = Integer.MAX_VALUE;

        for(char val : myhash.keySet())
        {
            count = Math.min(count, myhash.get(val) / myhash2.get(val));
        }

        return count;

    }
}