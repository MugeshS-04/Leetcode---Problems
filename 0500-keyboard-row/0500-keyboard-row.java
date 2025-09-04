class Solution {
    public String[] findWords(String[] words) {
        String first = "qwertyuiopQWERTYUIOP";
        String second = "asdfghjklASDFGHJKL";
        String third = "zxcvbnmZXCVBNM";

        ArrayList<String> mylist = new ArrayList<>();

        for(String word : words)
        {
            if(first.contains(word.charAt(0)+""))
            {
                if(check(word, first)) mylist.add(word);
            }
            else if(second.contains(word.charAt(0)+""))
            {
                if(check(word, second)) mylist.add(word);
            }
            else
            {
                if(check(word, third)) mylist.add(word);
            }
        }

        int size = mylist.size();

        String result[] = new String[size];

        int index = 0;

        for(String word : mylist)
        {
            result[index++] = word;
        }

        return result;
    }

    boolean check(String word, String keys)
    {
        for(int i = 0; i < word.length(); i++)
        {
            if(!keys.contains(word.charAt(i)+"")) return false;
        }

        return true;
    }
}