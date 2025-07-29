class Solution {
    public boolean isMatch(String s, String p) {
        if(p.equals("*"))
        {
            return true;
        }
        HashMap <String, Boolean> memo = new HashMap<>();
        return dp(0, 0, s, p, memo);
    }

    boolean dp(int w1, int w2, String s, String p, HashMap <String, Boolean> memo)
    {
        String key = w1+","+w2;

        if(memo.containsKey(key))
        {
            return memo.get(key);
        }

        if(w2 == p.length())
        {
            return w1 == s.length();
        }

        boolean firstmatch = w1 < s.length() && (s.charAt(w1) == p.charAt(w2) || p.charAt(w2) == '?');

        boolean ans;

        if(p.charAt(w2) == '*')
        {
            ans = dp(w1, w2+1, s, p, memo) || (w1 < s.length() && dp(w1 + 1, w2, s, p, memo));
        }
        else
        {
            ans = firstmatch && dp(w1+1, w2+1, s, p ,memo);
        }

        memo.put(key, ans);

        return ans;
    }
}