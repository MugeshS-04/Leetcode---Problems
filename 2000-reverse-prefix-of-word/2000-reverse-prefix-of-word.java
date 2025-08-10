class Solution {
    public String reversePrefix(String word, char ch) {
        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == ch)
            {
               word = reverse(word, 0, i);
               break;
            }
        }

        return word;
    }

    String reverse(String word, int start, int end)
    {
        int n = word.length();

        StringBuilder sb = new StringBuilder();

        for(int i = end; i >= 0; i--)
        {
            sb.append(word.charAt(i));
        }

        for(int i = end+1; i < n; i++)
        {
            sb.append(word.charAt(i));
        }

        return new String(sb);
    }
}