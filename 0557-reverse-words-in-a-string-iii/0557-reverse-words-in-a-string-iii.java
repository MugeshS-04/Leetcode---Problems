class Solution {
    public String reverseWords(String s) {
        String result = new String();
        int k = 0;
        int i = 0;

        for(i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == ' ' && k == 0)
            {
                String word = reverse(s.substring(k, i));
                result += word;
                k = i+1;
            }

            else if(s.charAt(i) == ' ')
            {
                String word = reverse(s.substring(k, i));
                result += " " + word;
                k = i+1;
            }
        }

        String word = reverse(s.substring(k, i));
        if(k == 0) {
            result += word;
        }
        else
        {
            result += " "+ word;
        }

        return result;
    }

    String reverse(String word)
    {
        char[] w = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;

        while(start < end)
        {
            char temp = w[start];
            w[start] = w[end];
            w[end] = temp;

            start++;
            end--;
        }

        return new String(w);
    }
}