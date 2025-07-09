class Solution {
    public int countCharacters(String[] words, String chars) {
        int arr[] = new int[26];
        int tot = 0;

        for(int i = 0; i < chars.length(); i++)
        {
            arr[chars.charAt(i) - 'a']++;
        }

        for(String word : words)
        {
            int fre[] = new int[26];

            for(int i = 0; i < word.length(); i++)
            {
                fre[word.charAt(i) - 'a']++;
            }

            int count = 0;

            for(int i = 0; i < word.length(); i++)
            {
                if(fre[word.charAt(i) - 'a'] <= arr[word.charAt(i) - 'a'])
                {
                    count++;
                }
            }

            if(count == word.length())
            {
                tot+=count;
            }
        }

        return tot;
    }
}