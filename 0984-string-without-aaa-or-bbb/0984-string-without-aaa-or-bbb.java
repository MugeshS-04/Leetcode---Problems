class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder sb = new StringBuilder();

        while(a > 0 || b > 0)
        {
            int size = sb.length();

            if(size >= 2 && sb.charAt(size-2) == sb.charAt(size-1))
            {
                if(sb.charAt(size-1) == 'a')
                {
                    sb.append('b');
                    b--;
                }
                else
                {
                    sb.append('a');
                    a--;
                }
            }
            else
            {
                if(a >= b)
                {
                    sb.append('a');
                    a--;
                }
                else
                {
                    sb.append('b');
                    b--;
                }
            }
        }

        return new String(sb);
    }
}