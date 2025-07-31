class Solution {
    public int numDifferentIntegers(String word) {
        int start = 0;
        HashSet <String> myset = new HashSet<>();

        while(start < word.length())
        {
            if(start < word.length() && Character.isDigit(word.charAt(start)))
            {
                int begin = start;

                while(start < word.length() && Character.isDigit(word.charAt(start)))
                {
                    start++;
                }

                while(begin < start && word.charAt(begin) == '0')
                {
                    begin++;
                }

                String num = begin == start ? "0" : word.substring(begin, start);
                System.out.println(word.substring(begin, start));
                myset.add(word.substring(begin, start));
                    
            }
            else
            {
                start++;
            }
        }

        return myset.size();
    }
}