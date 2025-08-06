class Solution {
    public String smallestSubsequence(String s) {
        StringBuilder sb = new StringBuilder();

        boolean check[] = new boolean[26];
        int lastindex[] = new int[26];

        for(int i = 0; i < s.length(); i++)
        {
            lastindex[s.charAt(i) - 'a'] = i;
        }

        for(int i = 0; i < s.length(); i++)
        {
            if(check[s.charAt(i) - 'a'])
            {
                continue;
            }

            while(sb.length() > 0 && sb.charAt(sb.length() - 1) > s.charAt(i) && i < lastindex[sb.charAt(sb.length() - 1) - 'a'])
            {
                check[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.setLength(sb.length() - 1);
            }

            sb.append(s.charAt(i));
            check[s.charAt(i) - 'a'] = true;
        }

        return sb.toString();
    }
}