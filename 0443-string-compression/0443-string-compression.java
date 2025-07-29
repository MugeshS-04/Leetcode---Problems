class Solution {
    public int compress(char[] chars) {
        int count = 0;
        char val = chars[0];
        int end = 0;

        int index = 0;

        if(chars.length == 1)
        {
            return 1;
        }

        while(end < chars.length)
        {
            if(chars[end] == val)
            {
                count++;
                end++;
            }
            else
            {
                if(count == 1)
                {
                    chars[index++] = val;
                }
                else
                {
                    chars[index++] = val;
                    index = tonum(chars, index, count);
                }

                val = chars[end];
                count = 0;
            }
        }

        if(count == 1)
        {
            chars[index++] = val;
        }
        else
        {
            chars[index++] = val;
            index = tonum(chars, index, count);
        }

        return index;
    }

    int tonum(char[] chars, int index, int count)
    {
        if(count <= 9)
        {
            chars[index++] = (char)(count + '0');
            return index;
        }

        String a = Integer.toString(count);
        for(int i = 0; i < a.length(); i++)
        {
            chars[index++] = a.charAt(i);
        }

        return index++;
    }
}