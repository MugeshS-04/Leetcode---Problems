class Solution {
    public int maxDifference(String s) {
        HashMap <Character, Integer> myhash = new HashMap();
        for(int i = 0; i < s.length(); i++)
        {
            myhash.put(s.charAt(i), myhash.getOrDefault(s.charAt(i), 0)+1);
        }
        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int val : myhash.values())
        {
            if(val > max && val%2 != 0)
            {
                max = val;
            }
            if(val < min && val%2 == 0)
            {
                min = val;
            }
        }
        return max - min;
    }
}