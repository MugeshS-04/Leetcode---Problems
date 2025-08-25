class Solution {
    public int longestPalindromeSubseq(String s) {
        char[] rev = s.toCharArray();

        int start = 0;
        int end = rev.length-1;

        while(start < end)
        {
            char temp = rev[start];
            rev[start++] = rev[end];
            rev[end--] = temp;
        }

        String r = new String(rev);

        int dp[][] = new int[s.length() + 1][s.length() + 1];

        for(int i = 1; i <= s.length(); i++)
        {
            for(int j = 1; j <= s.length(); j++)
            {
                if(s.charAt(i-1) == r.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[s.length()][s.length()];
    }
}