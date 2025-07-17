class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length() == k)
        {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < num.length(); i++)
        {
            while(sb.length() > 0 && num.charAt(i) < sb.charAt(sb.length() - 1) && k > 0)
            {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(num.charAt(i));
        }

        if(k > 0)
        {
            sb.setLength(sb.length() - k);
        } 

        int i = 0;

        while(i < sb.length() && sb.charAt(i) == '0')
        {
            i++;
        }

        String result = sb.substring(i);

        return result.isEmpty() ? "0" : sb.substring(i);
    }
}