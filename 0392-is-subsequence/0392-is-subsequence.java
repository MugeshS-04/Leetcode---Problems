class Solution {
    public boolean isSubsequence(String s, String t) {
        int start = 0;
        int st = 0;
        while(start < t.length() && st < s.length())
        {
            if(t.charAt(start) == s.charAt(st))
            {
                st++;
            }
            start++;
        }

        if(st < s.length())
        {
            return false;
        }
        return true;
    }
}