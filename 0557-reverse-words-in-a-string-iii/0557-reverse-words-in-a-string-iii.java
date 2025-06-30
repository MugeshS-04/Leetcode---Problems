class Solution {
    public String reverseWords(String s) {
        String result = new String();
        int k = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == ' ')
            {
                String word = reverse(s.substring(k, i));
                result += " " + word;
                k = i+1;
            }
        }

        String word = reverse(s.substring(k, s.length()));
        result += " "+ word;

        return result.trim();
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