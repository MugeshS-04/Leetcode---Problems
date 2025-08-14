class Solution {
    public String largestGoodInteger(String num) {
        int e = -1;

        int end = 2;

        while(end < num.length())
        {
            if(num.charAt(end - 2) == num.charAt(end - 1) && num.charAt(end) == num.charAt(end-1))
            {
                if(e == -1 || num.charAt(end) > num.charAt(e)) {
                    e = end;
                }
            }
            end++;
        }

        return e == -1 ? "" : num.substring(e-2, e+1);
    }
}