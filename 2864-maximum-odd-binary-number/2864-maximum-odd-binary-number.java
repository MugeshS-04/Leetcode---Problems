class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count = 0;
        int len = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '1')
            {
                count++;
            }
        }

        StringBuilder sb = new StringBuilder();
        while(count-- >= 2)
        {
            sb.append('1');
            len++;
        }

        for(int i = len+1; i < s.length(); i++)
        {
            sb.append('0');
        }

        sb.append('1');

        return new String(sb);
    }
}