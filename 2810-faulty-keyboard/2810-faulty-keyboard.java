class Solution {
    public String finalString(String s) {
        char[] result = new char[s.length()];
        int count = 0;
        int index = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'i')
            {
                count++;
                reverse(result, index);
            }
            else
            {
                result[index++] = s.charAt(i);
            }
        }

        String res = new String(result);

        return res.substring(0, s.length() - count);
    }

    void reverse(char[] result, int index)
    {
        int start = 0;
        int end = index-1;

        while(start < end)
        {
            char temp = result[start];
            result[start] = result[end];
            result[end] = temp;

            start++;
            end--;
        }
    }
}