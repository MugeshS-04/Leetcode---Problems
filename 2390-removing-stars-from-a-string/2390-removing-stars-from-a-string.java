class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        int start = 0;

        while(start < s.length())
        {
            if(s.charAt(start) != '*')
            {
                sb.append(s.charAt(start));
            }
            else
            {
                sb.deleteCharAt(sb.length() - 1);
            }

            start++;
        }

        return sb.toString();

    }
}