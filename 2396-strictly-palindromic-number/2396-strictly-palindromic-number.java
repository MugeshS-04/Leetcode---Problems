class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i = 2; i <= n-2; i++)
        {
            String num = Integer.toString(n, i);
            if(palindrome(num) != true) return false;
        }
        return true;
    }

    boolean palindrome(String num)
    {
        int start = 0;
        int end = num.length()-1;

        while(start < end)
        {
            if(num.charAt(start) != num.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}