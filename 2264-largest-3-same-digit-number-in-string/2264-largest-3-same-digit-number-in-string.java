class Solution {
    public String largestGoodInteger(String num) {
        int s = -1;
        int e = -1;
        int start = 0;
        int end = 2;

        while(end < num.length())
        {
            if(num.charAt(start) == num.charAt(end) && num.charAt(end) == num.charAt(end-1))
            {
                if(s == -1 || num.charAt(start) > num.charAt(s)) {
                    s = start;
                    e = end;
                }
            }
            start++;
            end++;
        }

        return s == -1 ? "" : num.substring(s, e+1);
    }
}