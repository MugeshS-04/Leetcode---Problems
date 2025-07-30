class Solution {
    public String countAndSay(int n) {
        int count = 0;

        StringBuilder sb = new StringBuilder();
        sb.append('1');
        char val = '1';

        for(int i = 1; i < n; i++)
        {
            StringBuilder temp = new StringBuilder();
            val = sb.charAt(0);
            count = 0;
            
            for(int j = 0; j < sb.length(); j++)
            {
                if(val == sb.charAt(j))
                {
                    count++;
                    if(j+1 == sb.length())
                    {
                        temp.append(count);
                        temp.append(val);
                    }
                }
                else
                {
                    temp.append(count);
                    temp.append(val);
                    val = sb.charAt(j);
                    j--;
                    count = 0;
                }

            }

            sb.setLength(0);
            sb.append(new String(temp));
        }

        return new String(sb);
    }
}