class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];

        int left = 0;
        int right = 0;
        
        int maxlen = 0;
        int maxcount = 0;

        while(right < s.length())
        {
            char temp = s.charAt(right);
            freq[temp - 'A']++;

            maxlen = Math.max(maxlen, freq[temp - 'A']);

            while((right - left) + 1 - maxlen > k)
            {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxcount = Math.max(maxcount, right - left + 1);

            right++;
        }

        return maxcount;
    }
}