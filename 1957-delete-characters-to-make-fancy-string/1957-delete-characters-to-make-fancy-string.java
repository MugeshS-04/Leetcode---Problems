class Solution {
    public String makeFancyString(String s) {
        int count = 1;
        char val = s.charAt(0);
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < s.length(); i++)
        {
            if(s.charAt(i) == val)
            {
                count++;
                if(count < 3)
                {
                    sb.append(val);
                }
            }
            else
            {
                sb.append(val);
                val = s.charAt(i);
                count = 1;
            }
            
        }

        sb.append(s.charAt(s.length() - 1));

        return sb.toString();
    }
}