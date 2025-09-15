class Solution {
    public int canBeTypedWords(String text, String br) {
        String[] arr = text.split(" ");
        int count = arr.length;

        for(String word : arr)
        {
            for(int i = 0; i < br.length(); i++)
            {
                if(word.contains(br.charAt(i)+""))
                {
                    count--;
                    break;
                }
            }
        }

        return count;

    }
}