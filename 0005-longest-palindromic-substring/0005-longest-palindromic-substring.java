class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        String result = s.charAt(0)+"";
        for(int i = 0; i < s.length()-1; i++)
        {
            for(int j = i; j < s.length(); j++)
            {
                String sub = s.substring(i, j+1);
                if(palindrome(sub, max) && j-i > max)
                {
                    max = j-i;
                    result = new String(sub);
                }
            }
        }
        return result;
    }

    boolean palindrome(String sub, int max)
    {
        int start = 0;
        int end = sub.length()-1;

        if(end - start > max)
        {
            while(start < end)
            {
                if(sub.charAt(start++) != sub.charAt(end--))
                {
                    return false;
                }
            }
            return true;
        }
        else
        {
            return false;
        }
    }
}