class Solution {
    public List<String> removeAnagrams(String[] words) {
        boolean[] check = new boolean[words.length];
        List<String> result = new ArrayList<>();

        for(int i = 1; i < words.length; i++)
        {
            char[] word1 = words[i].toCharArray();
            char[] word2 = words[i-1].toCharArray();
            Arrays.sort(word1);
            Arrays.sort(word2);
            String w1 = new String(word1);
            String w2 = new String(word2);

            if(w1.equals(w2))
            {
                check[i] = true;   
            }
        }

        for(int i = 0; i < words.length; i++)
        {
            if(check[i])
            {
                continue;
            }
            else result.add(words[i]);
        }

        return result;
    }
}