class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;

        int max = 0;

        HashSet <Character> myset = new HashSet<>();

        while(end < s.length())
        {
            if(!myset.contains(s.charAt(end)))
            {
                myset.add(s.charAt(end));
                end++;
                if(end - start > max)
                {
                    max = end - start;
                }
            }
            else
            {
                myset.remove(s.charAt(start));
                start++;
            }
        }

        return max;
    }
}