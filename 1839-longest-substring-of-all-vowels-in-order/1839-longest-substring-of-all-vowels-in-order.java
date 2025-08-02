class Solution {
    public int longestBeautifulSubstring(String word) {
          int start = 0;
          int len = 0;
          int max = 0;

          int char_change = 0;

          while(start < word.length())
          {
            if(word.charAt(start) == 'a')
            {
                char val = 'a';
                while(start < word.length() && word.charAt(start) >= val)
                {
                    if(word.charAt(start) != val)
                    {
                        val = word.charAt(start);
                        char_change++;
                    }
                    len++;
                    //System.out.println("The index is "+start+" -> "+word.charAt(start)+" "+val+" -> "+len);
                    start++;
                }

                if(char_change == 4)
                {
                    max = Math.max(max, len);
                }
                len = 0;
                char_change = 0;
            }
            else
            {
                start++;
            }
          }

          return max;
    }
}