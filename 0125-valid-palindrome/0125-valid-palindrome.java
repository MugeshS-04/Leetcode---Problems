class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 1)
        {
            return true;
        }
        int start = 0;
        int end = s.length()-1;
        s = s.toLowerCase();

        while(start < end)
        {
            while(start < s.length() && !Character.isLetter(s.charAt(start)) && !Character.isDigit(s.charAt(start)))
            {
                start++;
            }
            while(end >= 0 && !Character.isLetter(s.charAt(end)) && !Character.isDigit(s.charAt(end)))
            {
                end--;
            }

            if(start == s.length() && end < start)
            {
                return true;
            }
            
            if(s.charAt(start) != s.charAt(end))
            {
                System.out.println(s.charAt(start)+" "+s.charAt(end));
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}