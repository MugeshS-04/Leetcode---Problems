class Solution {
    public String sortVowels(String s) {
        PriorityQueue<Character> myq = new PriorityQueue<>((a, b) -> {
            if(a < b) return -1;
            else if(a > b) return 1;
            else return 0; 
        });

        String vowels = "aeiouAEIOU";
        char[] result = s.toCharArray();

        for(int i = 0; i < s.length(); i++)
        {
            if(vowels.contains(s.charAt(i)+""))
            {
                myq.add(s.charAt(i));
            }
        }

        for(int i = 0; i < s.length(); i++)
        {
            if(vowels.contains(s.charAt(i)+""))
            {
                result[i] = myq.poll();
            }
        }

        return new String(result);
    }
}