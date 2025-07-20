class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int start = 0;
        int cookies = 0;

        while(start < g.length && cookies < s.length)
        {
            if(g[start] <= s[cookies])
            {
                start++;
                cookies++;
            }
            else
            {
                cookies++;
            }
        }

        return start;
    }
}