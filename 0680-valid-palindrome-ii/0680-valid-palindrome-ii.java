class Solution {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        if(s.charAt(start) != s.charAt(end))
        {
            boolean result = check(s, start+1, end) || check(s, start, end-1);
            return result;
        }

        while(start <= end)
        {
            if(s.charAt(start) == s.charAt(end))
            {
                start++;
                end--;
            }
            else
            {
                boolean result = check(s, start+1, end) || check(s, start, end-1);
                return result;
            }
        }

        return true;
    }

    boolean check(String word, int start, int end)
    {
        while(start <= end)
        {
            if(word.charAt(start) == word.charAt(end))
            {
                start++;
                end--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}